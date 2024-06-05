package spring.model;

import spring.enums.MealPhase;
import spring.enums.MealPhaseType;
import spring.enums.MedicationType;

public class Medication {
    private Long id;
    private String name;
    private MedicationType type;
    private MealPhaseType phaseType;
    private MealPhase phase;
    private String picture;

    public Medication() {
    }

    public Medication(String name, MedicationType type, MealPhaseType phaseType, MealPhase phase, String picture) {
        this.name = name;
        this.type = type;
        this.phaseType = phaseType;
        this.phase = phase;
        this.picture = picture;
    }

    public Medication(Long id, String name, MedicationType type, MealPhaseType phaseType, MealPhase phase, String picture) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.phaseType = phaseType;
        this.phase = phase;
        this.picture = picture;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MedicationType getType() {
        return type;
    }

    public void setType(MedicationType type) {
        this.type = type;
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

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", phaseType=" + phaseType +
                ", phase=" + phase +
                ", picture='" + picture + '\'' +
                '}';
    }
}
