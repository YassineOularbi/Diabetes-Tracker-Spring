package spring.model.exercise;

import spring.enums.ExerciseType;
import spring.model.Exercise;
import spring.model.Measure;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Cycling extends Exercise {
    public Cycling() {
        super();
        this.setType(ExerciseType.Cycling);
    }

    public Cycling(String name, ExerciseType type, String duration, String description, String picture, List<Measure> measures) {
        super(name, type, duration, description, picture, measures);
        this.setType(ExerciseType.Cycling);
    }

    public Cycling(Long id, String name, ExerciseType type, String duration, String description, String picture, List<Measure> measures) {
        super(id, name, type, duration, description, picture, measures);
        this.setType(ExerciseType.Cycling);
    }
}
