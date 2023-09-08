package polymorphism;

import polymorphism.shape.RandomShapes;
import polymorphism.shape.Shape;

public class Shapes {
    public static void main(String[] args) {
        RandomShapes gen = new RandomShapes();

        for (Shape shape: gen.array(9)) {
            shape.draw();
        }
    }
}
