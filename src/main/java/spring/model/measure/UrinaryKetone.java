package spring.model.measure;

import spring.enums.MealPhase;
import spring.enums.MealPhaseType;
import spring.enums.MeasureType;
import spring.enums.Status;
import spring.model.Measure;

import java.sql.Date;
import java.sql.Time;

public class UrinaryKetone extends Measure {
    public UrinaryKetone() {
        super();
        this.setType(MeasureType.UrinaryKetone);
    }

    public UrinaryKetone(Double value, MealPhaseType phaseType, MealPhase phase, Date date, Time hour, MeasureType type, Status status) {
        super(value, phaseType, phase, date, hour, type, status);
        this.setType(MeasureType.UrinaryKetone);
    }

    public UrinaryKetone(Long id, Double value, MealPhaseType phaseType, MealPhase phase, Date date, Time hour, MeasureType type, Status status) {
        super(id, value, phaseType, phase, date, hour, type, status);
        this.setType(MeasureType.UrinaryKetone);
    }
}