package spring.model.meal;

import spring.enums.MealPhase;
import spring.enums.MedicationType;
import spring.model.Diabetic;
import spring.model.Meal;
import spring.model.Recipe;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Breakfast extends Meal {
    public Breakfast() {
        super();
        this.setPhase(MealPhase.Breakfast);
    }

    public Breakfast(String name, MealPhase phase, String picture, List<Diabetic> diabetics, Recipe recipe) {
        super(name, phase, picture, diabetics, recipe);
        this.setPhase(MealPhase.Breakfast);
    }

    public Breakfast(Long id, String name, MealPhase phase, String picture, List<Diabetic> diabetics, Recipe recipe) {
        super(id, name, phase, picture, diabetics, recipe);
        this.setPhase(MealPhase.Breakfast);
    }
}
