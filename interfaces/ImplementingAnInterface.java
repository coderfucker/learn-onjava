public interface ImplementingAnInterface {
    void idea1();
    void idea2();
}

class Implementation implements ImplementingAnInterface {
    @Override
    public void idea1() {
        System.out.println("idea1");
    }

    @Override
    public void idea2() {
        System.out.println("idea2");
    }
}