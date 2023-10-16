package typeinfo;

public class GenericClassReferences {
    public static void main(String[] args) throws ClassNotFoundException {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        Class<?> c = Class.forName("java.lang.String");

        genericIntClass = Integer.class;
        intClass = double.class;
//        genericIntClass = double.class;
    }
}
