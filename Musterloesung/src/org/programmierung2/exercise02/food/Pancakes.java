package org.programmierung2.exercise02.food;

public class Pancakes extends CompositeFood {
    public Pancakes() {
        super("Pancakes", new Food[] {
                new Flour(133),
                new Milk(250),
                new Egg(),
        });
    }
}
