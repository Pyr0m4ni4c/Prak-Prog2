package org.programmierung2.exercise02.food;

public abstract class BasicFood extends Food {
    protected int grams;
    protected int caloriesPer100g;

    public BasicFood(String name, int grams, int caloriesPer100g) {
        super(name);
        this.grams = grams;
        this.caloriesPer100g = caloriesPer100g;
    }

    public int getTotalCalories() {
            return (int) (grams * caloriesPer100g / 100.0f);
    }
}
