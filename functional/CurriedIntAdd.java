package functional;

import java.util.function.*;
public class CurriedIntAdd {
    public static void main(String[] args) {
        IntFunction<IntUnaryOperator> curriedIntAdd = a -> b -> a + b;
        IntUnaryOperator add = curriedIntAdd.apply(4);
        System.out.println(add.applyAsInt(5));
    }
}
