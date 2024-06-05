package spring.model;

import spring.enums.ExerciseType;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private ExerciseType type;
    private String duration;
    private String description;
    private String picture;
    @ManyToMany(mappedBy = "exercise")
    private List<Measure> measures;

    public Exercise() {
    }

    public Exercise(String name, ExerciseType type, String duration, String description, String picture, List<Measure> measures) {
        this.name = name;
        this.type = type;
        this.duration = duration;
        this.description = description;
        this.picture = picture;
        this.measures = measures;
    }

    public Exercise(Long id, String name, ExerciseType type, String duration, String description, String picture, List<Measure> measures) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.duration = duration;
        this.description = description;
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

    public ExerciseType getType() {
        return type;
    }

    public void setType(ExerciseType type) {
        this.type = type;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        return "Exercise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", duration='" + duration + '\'' +
                ", description='" + description + '\'' +
                ", picture='" + picture + '\'' +
                ", measures=" + measures +
                '}';
    }
}
