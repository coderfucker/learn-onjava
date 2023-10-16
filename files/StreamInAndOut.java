package files;

import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

public class StreamInAndOut {
    public static void main(String[] args) {
        try (
            Stream<String> input = Files.lines(Paths.get("learn-onjava/files/StreamInAndOut.java"));
            PrintWriter output = new PrintWriter("learn-onjava/files/StreamInAndOut.txt");
        ) {
            input.map(String::toUpperCase).forEachOrdered(output::println);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
