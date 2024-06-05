package spring.model.exercise;

import spring.enums.ExerciseType;
import spring.model.Exercise;

public class Walking extends Exercise {
    public Walking() {
        super();
        this.setType(ExerciseType.Walking);
    }

    public Walking(String name, ExerciseType type, String duration, String description, String picture) {
        super(name, type, duration, description, picture);
        this.setType(ExerciseType.Walking);
    }

    public Walking(Long id, String name, ExerciseType type, String duration, String description, String picture) {
        super(id, name, type, duration, description, picture);
        this.setType(ExerciseType.Walking);
    }
}
