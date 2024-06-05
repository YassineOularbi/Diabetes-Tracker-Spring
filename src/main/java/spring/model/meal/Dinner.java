package spring.model.meal;

import spring.enums.MealPhase;
import spring.model.Meal;

public class Dinner extends Meal {
    public Dinner() {
        super();
        this.setPhase(MealPhase.Dinner);
    }

    public Dinner(String name, MealPhase phase, String picture) {
        super(name, phase, picture);
        this.setPhase(MealPhase.Dinner);
    }

    public Dinner(Long id, String name, MealPhase phase, String picture) {
        super(id, name, phase, picture);
        this.setPhase(MealPhase.Dinner);
    }
}
