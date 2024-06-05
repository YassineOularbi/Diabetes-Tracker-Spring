package spring.model.meal;

import spring.enums.MealPhase;
import spring.enums.MedicationType;
import spring.model.Meal;

public class Breakfast extends Meal {
    public Breakfast() {
        super();
        this.setPhase(MealPhase.Breakfast);
    }

    public Breakfast(String name, MealPhase phase, String picture) {
        super(name, phase, picture);
        this.setPhase(MealPhase.Breakfast);
    }

    public Breakfast(Long id, String name, MealPhase phase, String picture) {
        super(id, name, phase, picture);
        this.setPhase(MealPhase.Breakfast);
    }
}
