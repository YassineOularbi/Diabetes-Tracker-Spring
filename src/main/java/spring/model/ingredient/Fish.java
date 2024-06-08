package spring.model.ingredient;

import spring.enums.IngredientType;
import spring.model.Ingredient;
import spring.model.Nutrient;
import spring.model.Recipe;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Fish extends Ingredient {
    public Fish() {
        super();
        this.setType(IngredientType.Fish);
    }

    public Fish(String name, String picture) {
        super(name, picture);
        this.setType(IngredientType.Fish);
    }

    public Fish(String name, Double amount, String picture, IngredientType type, List<Recipe> recipes, Nutrient nutrient) {
        super(name, amount, picture, type, recipes, nutrient);
        this.setType(IngredientType.Fish);
    }

    public Fish(Long id, String name, Double amount, String picture, IngredientType type, List<Recipe> recipes, Nutrient nutrient) {
        super(id, name, amount, picture, type, recipes, nutrient);
        this.setType(IngredientType.Fish);
    }
}
