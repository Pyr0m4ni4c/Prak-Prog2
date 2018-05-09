package org.programmierung2.exercise02.food;

import java.util.Random;

public class Pear extends BasicFood {
    public Pear() {
        super("Pear", 160 + new Random().nextInt(90), 57);
    }
}
