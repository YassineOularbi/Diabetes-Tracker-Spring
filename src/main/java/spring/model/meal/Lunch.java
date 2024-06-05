package spring.model.meal;

import spring.enums.MealPhase;
import spring.model.Meal;

public class Lunch extends Meal {
    public Lunch() {
        super();
        this.setPhase(MealPhase.Lunch);
    }

    public Lunch(String name, MealPhase phase, String picture) {
        super(name, phase, picture);
        this.setPhase(MealPhase.Lunch);
    }

    public Lunch(Long id, String name, MealPhase phase, String picture) {
        super(id, name, phase, picture);
        this.setPhase(MealPhase.Lunch);
    }
}
