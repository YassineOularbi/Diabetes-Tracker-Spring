package spring.model.medication;

import spring.enums.MealPhase;
import spring.enums.MealPhaseType;
import spring.enums.MedicationType;
import spring.model.Medication;

public class Syrup extends Medication {
    public Syrup() {
        super();
        this.setType(MedicationType.Syrup);
    }

    public Syrup(String name, MedicationType type, MealPhaseType phaseType, MealPhase phase, String picture) {
        super(name, type, phaseType, phase, picture);
        this.setType(MedicationType.Syrup);
    }

    public Syrup(Long id, String name, MedicationType type, MealPhaseType phaseType, MealPhase phase, String picture) {
        super(id, name, type, phaseType, phase, picture);
        this.setType(MedicationType.Syrup);
    }
}
