package org.programmierung2.exercise02.food;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class MenuGenerator {
    protected final Random rand;

    private enum FoodType {
        APPLE {
            @Override
            public Food makeFood() {
                return new Apple();
            }
        },
        PEAR {
            @Override
            public Food makeFood() {
                return new Pear();
            }
        },
        EGG {
            @Override
            public Food makeFood() {
                return new Egg();
            }
        },
        MILK {
            @Override
            public Food makeFood() {
                return new Milk(100 + new Random().nextInt(150));
            }
        },
        PANCAKES {
            @Override
            public Food makeFood() {
                return new Pancakes();
            }
        };
        public abstract Food makeFood();
    }

    public MenuGenerator() {
        this.rand = new Random();
    }

    public Food[] generateMenu(int maxSize, Comparator<Food> cmp) {
        int sz = rand.nextInt(maxSize) + 1;
        Food[] result = new Food[sz];
        for (int i=0; i<sz; i++) {
            result[i] = makeRandomFood();
        }

        Arrays.sort(result, cmp);

        return result;
    }

    protected Food makeRandomFood() {
        int ix = rand.nextInt(FoodType.values().length);
        FoodType selectedType = FoodType.values()[ix];
        return selectedType.makeFood();
    }

    public static void main(String[] args) {
        MenuGenerator g = new MenuGenerator();
        for (int i = 1; i<=4; i++) {
            System.out.println("Menü " + i + ": " + Arrays.toString(g.generateMenu(4, Food.BY_TOTAL_CALORIES)));
        }
    }
}
