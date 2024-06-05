package spring.model.medication;

import spring.enums.MealPhase;
import spring.enums.MealPhaseType;
import spring.enums.MedicationType;
import spring.model.Measure;
import spring.model.Medication;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Insulin extends Medication {
    public Insulin() {
        super();
        this.setType(MedicationType.Insulin);
    }

    public Insulin(String name, MedicationType type, MealPhaseType phaseType, MealPhase phase, String picture, List<Measure> measures) {
        super(name, type, phaseType, phase, picture, measures);
        this.setType(MedicationType.Insulin);
    }

    public Insulin(Long id, String name, MedicationType type, MealPhaseType phaseType, MealPhase phase, String picture, List<Measure> measures) {
        super(id, name, type, phaseType, phase, picture, measures);
        this.setType(MedicationType.Insulin);
    }
}
