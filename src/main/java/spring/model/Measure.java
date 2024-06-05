package spring.model;

import spring.enums.MealPhase;
import spring.enums.MealPhaseType;
import spring.enums.MeasureType;
import spring.enums.Status;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Entity
public class Measure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double value;
    @Enumerated(EnumType.STRING)
    private MealPhaseType phaseType;
    @Enumerated(EnumType.STRING)
    private MealPhase phase;
    private Date date;
    private Time hour;
    @Enumerated(EnumType.STRING)
    private MeasureType type;
    @Enumerated(EnumType.STRING)
    private Status status;
    @ManyToOne
    @JoinColumn(name = "diabetic_id")
    private Diabetic diabetic;
    @ManyToMany(mappedBy = "measure")
    private List<Medication> medications;
    @ManyToMany(mappedBy = "measure")
    private List<Exercise> exercises;

    public Measure() {
    }

    public Measure(Double value, MealPhaseType phaseType, MealPhase phase, Date date, Time hour, MeasureType type, Status status, Diabetic diabetic, List<Medication> medications, List<Exercise> exercises) {
        this.value = value;
        this.phaseType = phaseType;
        this.phase = phase;
        this.date = date;
        this.hour = hour;
        this.type = type;
        this.status = status;
        this.diabetic = diabetic;
        this.medications = medications;
        this.exercises = exercises;
    }

    public Measure(Long id, Double value, MealPhaseType phaseType, MealPhase phase, Date date, Time hour, MeasureType type, Status status, Diabetic diabetic, List<Medication> medications, List<Exercise> exercises) {
        this.id = id;
        this.value = value;
        this.phaseType = phaseType;
        this.phase = phase;
        this.date = date;
        this.hour = hour;
        this.type = type;
        this.status = status;
        this.diabetic = diabetic;
        this.medications = medications;
        this.exercises = exercises;
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

    public Diabetic getDiabetic() {
        return diabetic;
    }

    public void setDiabetic(Diabetic diabetic) {
        this.diabetic = diabetic;
    }

    public List<Medication> getMedications() {
        return medications;
    }

    public void setMedications(List<Medication> medications) {
        this.medications = medications;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
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
                ", diabetic=" + diabetic +
                ", medications=" + medications +
                ", exercises=" + exercises +
                '}';
    }
}
