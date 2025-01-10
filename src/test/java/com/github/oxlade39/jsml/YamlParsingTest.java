package com.github.oxlade39.jsml;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class YamlParsingTest {

    private static final String OUTPUT_DIR = "target/test-data";
    private static final File EXTRACT_DIR = new File(OUTPUT_DIR, "repo");

    static Stream<String> repos() {
        return Stream.of(
                "sml-models-tutorials-internet-sales",
                "sml-models-tutorials-ww-importers",
                "sml-models-tutorials-tpcds",
                "sml-models-tutorials-tpch",
                "sml-models-tutorials-adventureworks2012"
        );
    }

    static Stream<Arguments> smlTypes() {
        return repos().flatMap(repo ->
                Stream.of(
                    Arguments.of(repo, "calculations", Calculation.class),
                    Arguments.of(repo, "connections", Connection.class),
                    Arguments.of(repo, "datasets", Dataset.class),
                    Arguments.of(repo, "dimensions", Dimension.class),
                    Arguments.of(repo, "metrics", Metric.class),
                    Arguments.of(repo, "models", Model.class)
                )
        );
    }

    @ParameterizedTest
    @MethodSource("smlTypes")
    void testParsing(String repo, String folder, Class<?> type) throws IOException {
        sourceSMLLib(repo);
        parseAllInFolder(repo, folder, type);
    }

    private static void sourceSMLLib(String repo) throws IOException {
        var zipFile = new File(OUTPUT_DIR, "%s-repo.zip".formatted(repo));
        if (!zipFile.exists()) {
            zipFile.getParentFile().mkdirs();
            downloadFile(
                    "https://github.com/semanticdatalayer/%s/archive/refs/heads/main.zip".formatted(repo),
                    zipFile
            );
        }
        extractZip(zipFile, EXTRACT_DIR);
    }

    private void parseAllInFolder(String repo, String folder, Class<?> requiredType) throws IOException {
        var packageName = "%s-main".formatted(repo);
        Path calculationsDir = Paths.get(EXTRACT_DIR.getAbsolutePath(), packageName, folder);
        if (!Files.isDirectory(calculationsDir)) {
            throw new IllegalArgumentException("folder not found: " + calculationsDir);
        }

        try (Stream<Path> yamlPaths = Files.walk(calculationsDir)) {
            yamlPaths
                    .filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(".yml"))
                    .forEach(yamlPath -> parseYamlFile(yamlPath, requiredType));
        }
    }

    private void parseYamlFile(Path yamlPath, Class<?> requiredType) {
        String typeName = requiredType.getSimpleName();
        try {
            ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
            mapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);

            // Parse the YAML file to a Calculation object
            Object parsed = mapper.readValue(yamlPath.toFile(), requiredType);

            // Validate the parsed object
            assertNotNull(parsed, "Parsed %s object should not be null for file: %s".formatted(typeName, yamlPath));
        } catch (IOException e) {
            throw new RuntimeException("Failed to parse file: %s".formatted(yamlPath), e);
        }
    }

    private static void downloadFile(String fileUrl, File destination) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) new URL(fileUrl).openConnection();
        connection.setRequestMethod("GET");
        if (connection.getResponseCode() != 200) {
            throw new IOException("Failed to download file: HTTP code " + connection.getResponseCode());
        }
        try (InputStream inputStream = connection.getInputStream();
             FileOutputStream outputStream = new FileOutputStream(destination)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        }
    }

    private static void extractZip(File zipFile, File destDir) throws IOException {
        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFile))) {
            ZipEntry entry;
            while ((entry = zipInputStream.getNextEntry()) != null) {
                File entryFile = new File(destDir, entry.getName());
                if (entry.isDirectory()) {
                    entryFile.mkdirs();
                } else {
                    entryFile.getParentFile().mkdirs();
                    try (FileOutputStream outputStream = new FileOutputStream(entryFile)) {
                        byte[] buffer = new byte[4096];
                        int bytesRead;
                        while ((bytesRead = zipInputStream.read(buffer)) != -1) {
                            outputStream.write(buffer, 0, bytesRead);
                        }
                    }
                }
            }
        }
    }
}
