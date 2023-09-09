package interfaces.interfaceprocessor;

interface StringProcessor extends Processor {
    @Override
    String process(Object input);
    String s = "If she weighs the same as a duck, she's made of wood";

    static void main(String[] args) {
        Applicator.apply(new Upcase(), s);
        Applicator.apply(new Downcase(), s);
    }
}

class Upcase implements StringProcessor {
    @Override
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase implements StringProcessor {
    @Override
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}
