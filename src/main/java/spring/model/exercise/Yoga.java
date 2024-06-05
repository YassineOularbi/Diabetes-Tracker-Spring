package spring.model.exercise;

import spring.enums.ExerciseType;
import spring.model.Exercise;

public class Yoga extends Exercise {
    public Yoga() {
        super();
        this.setType(ExerciseType.Yoga);
    }

    public Yoga(String name, ExerciseType type, String duration, String description, String picture) {
        super(name, type, duration, description, picture);
        this.setType(ExerciseType.Yoga);
    }

    public Yoga(Long id, String name, ExerciseType type, String duration, String description, String picture) {
        super(id, name, type, duration, description, picture);
        this.setType(ExerciseType.Yoga);
    }
}
