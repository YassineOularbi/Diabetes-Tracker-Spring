package spring.model.ingredient;

import spring.enums.IngredientType;
import spring.model.Ingredient;

public class Meat extends Ingredient {
    public Meat() {
        super();
        this.setType(IngredientType.Meat);
    }

    public Meat(String name, Double amount, String picture, IngredientType type) {
        super(name, amount, picture, type);
        this.setType(IngredientType.Meat);
    }

    public Meat(Long id, String name, Double amount, String picture, IngredientType type) {
        super(id, name, amount, picture, type);
        this.setType(IngredientType.Meat);
    }
}
