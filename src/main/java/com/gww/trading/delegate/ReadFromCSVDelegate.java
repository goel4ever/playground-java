package com.gww.trading.delegate;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFromCSVDelegate {

    private static final String RESOURCE_PATH = "./src/main/resources/static/";
    private static final String FILE_NAME = "WIKI-AAPL.csv";

    /**
     * List all the files in current directory
     * @throws IOException
     */
    public void listFileInCurrentDirectory() throws IOException {

        // http://winterbe.com/posts/2015/03/25/java8-examples-string-number-math-files/

        try (Stream<Path> stream = Files.list(Paths.get(""))) {
            String joined = stream
                    .map(String::valueOf)
                    .filter(path -> !path.startsWith("."))
                    .sorted()
                    .collect(Collectors.joining("; "));
            System.out.println("List: " + joined);
        }
    }

    /**
     * Validates if a file exists or not
     * @param fileName String
     * @return boolean
     */
    public boolean isValidFilePathWithPermissions(String fileName) {
        File file = new File(fileName);
        return file.exists() && file.isFile();
    }

    public void readFromFile() {
        File file = new File(RESOURCE_PATH + FILE_NAME);
    }

    public static void main(String[] args) throws IOException {

        // TESTER
        ReadFromCSVDelegate delegate = new ReadFromCSVDelegate();
        System.out.println(delegate.isValidFilePathWithPermissions(RESOURCE_PATH + FILE_NAME));
    }

}
