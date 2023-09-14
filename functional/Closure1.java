package functional;

import java.util.*;
import java.util.function.Supplier;

public class Closure1 {
    Supplier<List<Integer>> makeFun() {
        List<Integer> ai = new ArrayList<>();
        ai.add(1);

        return () -> ai;
    }

    public static void main(String[] args) {
        Closure1 c1 = new Closure1();

        List<Integer> l1 = c1.makeFun().get(), l2 = c1.makeFun().get();

        System.out.println(l1);
        System.out.println(l2);

        l1.add(42);
        l2.add(96);

        System.out.println(l1);
        System.out.println(l2);
    }
}
