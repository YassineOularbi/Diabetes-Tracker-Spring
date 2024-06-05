package spring.model.measure;

import spring.enums.MealPhase;
import spring.enums.MealPhaseType;
import spring.enums.MeasureType;
import spring.enums.Status;
import spring.model.Diabetic;
import spring.model.Exercise;
import spring.model.Measure;
import spring.model.Medication;

import javax.persistence.Entity;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Entity
public class A1C extends Measure {
    public A1C() {
        super();
        this.setType(MeasureType.A1C);
    }

    public A1C(Double value, MealPhaseType phaseType, MealPhase phase, Date date, Time hour, MeasureType type, Status status, Diabetic diabetic, List<Medication> medications, List<Exercise> exercises) {
        super(value, phaseType, phase, date, hour, type, status, diabetic, medications, exercises);
        this.setType(MeasureType.A1C);
    }

    public A1C(Long id, Double value, MealPhaseType phaseType, MealPhase phase, Date date, Time hour, MeasureType type, Status status, Diabetic diabetic, List<Medication> medications, List<Exercise> exercises) {
        super(id, value, phaseType, phase, date, hour, type, status, diabetic, medications, exercises);
        this.setType(MeasureType.A1C);
    }
}
