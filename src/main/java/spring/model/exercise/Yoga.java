package spring.model.exercise;

import spring.enums.ExerciseType;
import spring.model.Exercise;
import spring.model.Measure;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Yoga extends Exercise {
    public Yoga() {
        super();
        this.setType(ExerciseType.Yoga);
    }

    public Yoga(String name, ExerciseType type, String duration, String description, String picture, List<Measure> measures) {
        super(name, type, duration, description, picture, measures);
        this.setType(ExerciseType.Yoga);
    }

    public Yoga(Long id, String name, ExerciseType type, String duration, String description, String picture, List<Measure> measures) {
        super(id, name, type, duration, description, picture, measures);
        this.setType(ExerciseType.Yoga);
    }
}
