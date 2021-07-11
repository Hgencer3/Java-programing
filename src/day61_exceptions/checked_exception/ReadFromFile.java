package day61_exceptions.checked_exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            String filePath = "src/day61_exceptions_collections/checked_exception/data2.txt";//olmayan data2 yi yaptik
            List<String> data = Files.readAllLines(Paths.get(filePath));
            for (String line : data) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("-----THE END----");
    }
}
