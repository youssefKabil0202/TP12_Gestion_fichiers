package exercice1;

import java.io.IOException;
import java.nio.file.*;

public class FileUtils {

    public static void copyFileUsingFiles(String source, String destination) throws IOException {
        Path sourcePath = Paths.get(source);
        Path destPath = Paths.get(destination);
        Files.copy(sourcePath, destPath, StandardCopyOption.REPLACE_EXISTING);
    }

    public static void readAllLines(String path) throws IOException {
        Files.lines(Paths.get(path)).forEach(System.out::println);
    }
}