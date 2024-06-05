package spring.model.ingredient;

import spring.enums.IngredientType;
import spring.model.Ingredient;

public class Fruit extends Ingredient {
    public Fruit() {
        super();
        this.setType(IngredientType.Fruit);
    }

    public Fruit(String name, Double amount, String picture, IngredientType type) {
        super(name, amount, picture, type);
        this.setType(IngredientType.Fruit);
    }

    public Fruit(Long id, String name, Double amount, String picture, IngredientType type) {
        super(id, name, amount, picture, type);
        this.setType(IngredientType.Fruit);
    }
}
