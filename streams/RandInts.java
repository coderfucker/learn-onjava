package streams;

import java.util.*;
import java.util.stream.*;

public class RandInts {
    public static int[] rints = new Random(47)
        .ints(0, 1000)
        .limit(100)
        .toArray();

    public static IntStream rands() {
        return Arrays.stream(rints);
    }

    public static void main(String[] args) {
        rands().limit(3).forEach(System.out::println);
    }
}
