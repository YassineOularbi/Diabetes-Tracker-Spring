package spring.model.ingredient;

import spring.enums.IngredientType;
import spring.model.Ingredient;

public class Vegetable extends Ingredient {
    public Vegetable() {
        super();
        this.setType(IngredientType.Vegetable);
    }

    public Vegetable(String name, Double amount, String picture, IngredientType type) {
        super(name, amount, picture, type);
        this.setType(IngredientType.Vegetable);
    }

    public Vegetable(Long id, String name, Double amount, String picture, IngredientType type) {
        super(id, name, amount, picture, type);
        this.setType(IngredientType.Vegetable);
    }
}
