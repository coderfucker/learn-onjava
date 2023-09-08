package hiding;

public class IceCream {
    IceCream() {
        System.out.println("constructor");
    }

    IceCream(int i) {
        System.out.println("params:" + i);
    }
    public static void main(String[] args) {
        IceCream a = new IceCream();
        IceCream b = new IceCream(1);
        System.out.println("main");
    }
}
