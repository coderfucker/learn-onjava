package functional;

import java.util.function.*;
public class Closure {
    int i;

    IntSupplier makeFun(int x) {
        return () -> x + i++;
    }
}
