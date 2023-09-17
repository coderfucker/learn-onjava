package streams;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class RandomWords implements Supplier<String> {
    List<String> words = new ArrayList<>();
    Random rand = new Random(47);

    RandomWords(String fname) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(fname));

        for (String line : lines.subList(1, lines.size())) {
            for (String word : line.split("[.?,]+"))
                words.add(word.toLowerCase());
        }

        System.out.println(lines);
        System.out.println(words);
    }

    @Override
    public String get() {
        return words.get(rand.nextInt(words.size()      ));
    }

    @Override
    public String toString() {
        return words.stream().collect(Collectors.joining(" "));
    }

    public static void main(String[] args) throws IOException {
        System.out.println(Stream.generate(new RandomWords("learn-onjava/streams/Cheese.dat")).limit(10).collect(Collectors.joining(" ")));
    }
}
