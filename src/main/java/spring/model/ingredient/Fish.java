package spring.model.ingredient;

import spring.enums.IngredientType;
import spring.model.Ingredient;

public class Fish extends Ingredient {
    public Fish() {
        super();
        this.setType(IngredientType.Fish);
    }

    public Fish(String name, double amount, String picture) {
        super(name, amount, picture, IngredientType.Fish);
    }

    public Fish(Long id, String name, double amount, String picture) {
        super(id, name, amount, picture, IngredientType.Fish);
    }
}
