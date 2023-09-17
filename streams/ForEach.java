package streams;

import static streams.RandInts.rands;

public class ForEach {
    static final int SZ = 14;

    public static void main(String[] args) {
        rands().limit(5).forEach(n -> System.out.format("%d ", n));
        System.out.println();

        rands().limit(5).parallel().forEach(n -> System.out.format("%d ", n));
        System.out.println();

        rands().limit(5).parallel().forEachOrdered(n -> System.out.format("%d ", n));
    }
}
