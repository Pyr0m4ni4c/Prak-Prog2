package org.programmierung2.exercise02.food;

import java.util.Comparator;

public abstract class Food {
    protected String name;

    public static final Comparator<Food> BY_TOTAL_CALORIES = new Comparator<Food>() {
        @Override
        public int compare(Food o1, Food o2) {
            return o1.getTotalCalories() - o2.getTotalCalories();
        }
    };

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return getName() + ":" + getTotalCalories() + "kCal";
    }

    public abstract int getTotalCalories();
}
