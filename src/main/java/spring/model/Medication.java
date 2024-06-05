package spring.model;

import spring.enums.MealPhase;
import spring.enums.MealPhaseType;
import spring.enums.MedicationType;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Medication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private MedicationType type;
    @Enumerated(EnumType.STRING)
    private MealPhaseType phaseType;
    @Enumerated(EnumType.STRING)
    private MealPhase phase;
    private String picture;
    @ManyToMany(mappedBy = "medication")
    private List<Measure> measures;

    public Medication() {
    }

    public Medication(String name, MedicationType type, MealPhaseType phaseType, MealPhase phase, String picture, List<Measure> measures) {
        this.name = name;
        this.type = type;
        this.phaseType = phaseType;
        this.phase = phase;
        this.picture = picture;
        this.measures = measures;
    }

    public Medication(Long id, String name, MedicationType type, MealPhaseType phaseType, MealPhase phase, String picture, List<Measure> measures) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.phaseType = phaseType;
        this.phase = phase;
        this.picture = picture;
        this.measures = measures;
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

    public List<Measure> getMeasures() {
        return measures;
    }

    public void setMeasures(List<Measure> measures) {
        this.measures = measures;
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
                ", measures=" + measures +
                '}';
    }
}
