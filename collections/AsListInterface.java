package collections;

import java.util.*;

class Snow {}
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow {}
public class AsListInterface {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
//        snow1.add(new Heavy());

        List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
//        snow2.add(new Slush());

        List<Snow> snow3 = new ArrayList<>();
        Collections.addAll(snow3, new Light(), new Heavy(), new Powder());
        snow3.add(new Crusty());
    }
}
