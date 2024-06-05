package spring.model.meal;

import spring.enums.MealPhase;
import spring.model.Diabetic;
import spring.model.Meal;
import spring.model.Recipe;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Dinner extends Meal {
    public Dinner() {
        super();
        this.setPhase(MealPhase.Dinner);
    }

    public Dinner(String name, MealPhase phase, String picture, List<Diabetic> diabetics, Recipe recipe) {
        super(name, phase, picture, diabetics, recipe);
        this.setPhase(MealPhase.Dinner);
    }

    public Dinner(Long id, String name, MealPhase phase, String picture, List<Diabetic> diabetics, Recipe recipe) {
        super(id, name, phase, picture, diabetics, recipe);
        this.setPhase(MealPhase.Dinner);
    }
}
