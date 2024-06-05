package spring.model.ingredient;

import spring.enums.IngredientType;
import spring.model.Ingredient;
import spring.model.Nutrient;
import spring.model.Recipe;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Meat extends Ingredient {
    public Meat() {
        super();
        this.setType(IngredientType.Meat);
    }

    public Meat(String name, Double amount, String picture, IngredientType type, List<Recipe> recipes, Nutrient nutrient) {
        super(name, amount, picture, type, recipes, nutrient);
        this.setType(IngredientType.Meat);
    }

    public Meat(Long id, String name, Double amount, String picture, IngredientType type, List<Recipe> recipes, Nutrient nutrient) {
        super(id, name, amount, picture, type, recipes, nutrient);
        this.setType(IngredientType.Meat);
    }
}
