package org.programmierung2.exercise02.food;

import java.util.Random;

public class Apple extends BasicFood {
    public Apple() {
        super("Apple", 110 + new Random().nextInt(90), 52);
    }
}
