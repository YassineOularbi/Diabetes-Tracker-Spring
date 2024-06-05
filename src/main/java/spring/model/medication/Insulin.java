package spring.model.medication;

import spring.enums.MealPhase;
import spring.enums.MealPhaseType;
import spring.enums.MedicationType;
import spring.model.Medication;

public class Insulin extends Medication {
    public Insulin() {
        super();
        this.setType(MedicationType.Insulin);
    }

    public Insulin(String name, MedicationType type, MealPhaseType phaseType, MealPhase phase, String picture) {
        super(name, type, phaseType, phase, picture);
        this.setType(MedicationType.Insulin);
    }

    public Insulin(Long id, String name, MedicationType type, MealPhaseType phaseType, MealPhase phase, String picture) {
        super(id, name, type, phaseType, phase, picture);
        this.setType(MedicationType.Insulin);
    }
}
