package spring.model.meal;

import spring.enums.MealPhase;
import spring.model.Diabetic;
import spring.model.Meal;
import spring.model.Recipe;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Lunch extends Meal {
    public Lunch() {
        super();
        this.setPhase(MealPhase.Lunch);
    }

    public Lunch(String name, MealPhase phase, String picture, List<Diabetic> diabetics, Recipe recipe) {
        super(name, phase, picture, diabetics, recipe);
        this.setPhase(MealPhase.Lunch);
    }

    public Lunch(Long id, String name, MealPhase phase, String picture, List<Diabetic> diabetics, Recipe recipe) {
        super(id, name, phase, picture, diabetics, recipe);
        this.setPhase(MealPhase.Lunch);
    }
}
