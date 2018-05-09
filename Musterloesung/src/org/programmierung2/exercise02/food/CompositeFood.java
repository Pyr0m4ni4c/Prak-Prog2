package org.programmierung2.exercise02.food;

public abstract class CompositeFood extends Food {
    private Food[] ingredients;

    public CompositeFood(String name, Food[] ingredients) {
        super(name);
        this.ingredients = ingredients;
    }

    @Override
    public int getTotalCalories() {
        int result = 0;
        for (int i = 0; i< ingredients.length; i++) {
            result += ingredients[i].getTotalCalories();
        }
        return result;
    }

    public Food[] getIngredients() {
        return ingredients;
    }
}
