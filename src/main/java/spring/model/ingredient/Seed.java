package spring.model.ingredient;

import spring.enums.IngredientType;
import spring.model.Ingredient;

public class Seed extends Ingredient {
    public Seed() {
        super();
        this.setType(IngredientType.Seed);
    }

    public Seed(String name, double amount, String picture) {
        super(name, amount, picture, IngredientType.Seed);
    }

    public Seed(Long id, String name, double amount, String picture) {
        super(id, name, amount, picture, IngredientType.Seed);
    }
}
