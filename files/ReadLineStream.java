package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadLineStream {
    public static void main(String[] args) throws IOException {
        Files.lines(Paths.get("learn-onjava/files/ReadLineStream.java"))
            .skip(7)
            .findFirst()
            .ifPresent(System.out::println);
    }
}
