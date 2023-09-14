package functional;

import java.util.function.IntSupplier;

public class SharedStorage {
    public static void main(String[] args) {
        Closure c1 = new Closure();
        IntSupplier f1 = c1.makeFun(0);
        IntSupplier f2 = c1.makeFun(0);
        IntSupplier f3 = c1.makeFun(0);
        IntSupplier f4 = c1.makeFun(1);

        System.out.println(f1.getAsInt());
        System.out.println(f2.getAsInt());
        System.out.println(f3.getAsInt());
        System.out.println(f4.getAsInt());
    }
}
