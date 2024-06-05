package spring.model.ingredient;

import spring.enums.IngredientType;
import spring.model.Ingredient;

public class SeaFruit extends Ingredient {
    public SeaFruit() {
        super();
        this.setType(IngredientType.SeaFruit);
    }

    public SeaFruit(String name, double amount, String picture) {
        super(name, amount, picture, IngredientType.SeaFruit);
    }

    public SeaFruit(Long id, String name, double amount, String picture) {
        super(id, name, amount, picture, IngredientType.SeaFruit);
    }
}
