package spring.model.medication;

import spring.enums.MealPhase;
import spring.enums.MealPhaseType;
import spring.enums.MedicationType;
import spring.model.Medication;

public class Pill extends Medication {
    public Pill() {
        super();
        this.setType(MedicationType.Pill);
    }

    public Pill(String name, MedicationType type, MealPhaseType phaseType, MealPhase phase, String picture) {
        super(name, type, phaseType, phase, picture);
        this.setType(MedicationType.Pill);
    }

    public Pill(Long id, String name, MedicationType type, MealPhaseType phaseType, MealPhase phase, String picture) {
        super(id, name, type, phaseType, phase, picture);
        this.setType(MedicationType.Pill);
    }
}
