package exceptions;

class MyException extends Exception {
    private int x;

    MyException() {
    }

    MyException(String msg) {
        super(msg);
    }

    MyException(String msg, int x) {
        super(msg);
        this.x = x;
    }

    public int val() {
        return x;
    }

    @Override
    public String getMessage() {
        return "Detial Message:" + x + "\n" + super.getMessage();
    }
}

public class ExtraFeatures {
    public static void f() throws MyException {
        System.out.println("f()");
        throw new MyException();
    }

    public static void g() throws MyException {
        System.out.println("g()");
        throw new MyException("originated in g()");
    }

    public static void h() throws MyException {
        System.out.println("h()");
        throw new MyException("originated in h()", 47);
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }

        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }

        try {
            h();
        } catch (MyException e) {
            e.printStackTrace(System.out);
            System.out.println("e.val() = " + e.val());
        }
    }
}
