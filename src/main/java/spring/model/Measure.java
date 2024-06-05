package spring.model;

import spring.enums.MealPhase;
import spring.enums.MealPhaseType;
import spring.enums.MeasureType;
import spring.enums.Status;

import java.sql.Date;
import java.sql.Time;

public class Measure {
    private Long id;
    private Double value;
    private MealPhaseType phaseType;
    private MealPhase phase;
    private Date date;
    private Time hour;
    private MeasureType type;
    private Status status;

    public Measure() {
    }

    public Measure(Double value, MealPhaseType phaseType, MealPhase phase, Date date, Time hour, MeasureType type, Status status) {
        this.value = value;
        this.phaseType = phaseType;
        this.phase = phase;
        this.date = date;
        this.hour = hour;
        this.type = type;
        this.status = status;
    }

    public Measure(Long id, Double value, MealPhaseType phaseType, MealPhase phase, Date date, Time hour, MeasureType type, Status status) {
        this.id = id;
        this.value = value;
        this.phaseType = phaseType;
        this.phase = phase;
        this.date = date;
        this.hour = hour;
        this.type = type;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public MealPhaseType getPhaseType() {
        return phaseType;
    }

    public void setPhaseType(MealPhaseType phaseType) {
        this.phaseType = phaseType;
    }

    public MealPhase getPhase() {
        return phase;
    }

    public void setPhase(MealPhase phase) {
        this.phase = phase;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getHour() {
        return hour;
    }

    public void setHour(Time hour) {
        this.hour = hour;
    }

    public MeasureType getType() {
        return type;
    }

    public void setType(MeasureType type) {
        this.type = type;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Measure{" +
                "id=" + id +
                ", value=" + value +
                ", phaseType=" + phaseType +
                ", phase=" + phase +
                ", date=" + date +
                ", hour=" + hour +
                ", type=" + type +
                ", status=" + status +
                '}';
    }
}
