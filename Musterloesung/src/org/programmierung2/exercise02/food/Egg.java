package org.programmierung2.exercise02.food;

import java.util.Random;

public class Egg extends BasicFood {
    public Egg() {
        super("Egg", 44 + new Random().nextInt(16), 155);
    }
}
