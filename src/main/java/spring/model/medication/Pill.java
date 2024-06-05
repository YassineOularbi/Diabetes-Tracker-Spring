package spring.model.medication;

import spring.enums.MealPhase;
import spring.enums.MealPhaseType;
import spring.enums.MedicationType;
import spring.model.Measure;
import spring.model.Medication;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Pill extends Medication {
    public Pill() {
        super();
        this.setType(MedicationType.Pill);
    }

    public Pill(String name, MedicationType type, MealPhaseType phaseType, MealPhase phase, String picture, List<Measure> measures) {
        super(name, type, phaseType, phase, picture, measures);
        this.setType(MedicationType.Pill);
    }

    public Pill(Long id, String name, MedicationType type, MealPhaseType phaseType, MealPhase phase, String picture, List<Measure> measures) {
        super(id, name, type, phaseType, phase, picture, measures);
        this.setType(MedicationType.Pill);
    }
}
