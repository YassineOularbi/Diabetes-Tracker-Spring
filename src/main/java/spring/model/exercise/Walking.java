package spring.model.exercise;

import spring.enums.ExerciseType;
import spring.model.Exercise;
import spring.model.Measure;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Walking extends Exercise {
    public Walking() {
        super();
        this.setType(ExerciseType.Walking);
    }

    public Walking(String name, ExerciseType type, String duration, String description, String picture, List<Measure> measures) {
        super(name, type, duration, description, picture, measures);
        this.setType(ExerciseType.Walking);
    }

    public Walking(Long id, String name, ExerciseType type, String duration, String description, String picture, List<Measure> measures) {
        super(id, name, type, duration, description, picture, measures);
        this.setType(ExerciseType.Walking);
    }
}
