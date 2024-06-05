package spring.model.exercise;

import spring.enums.ExerciseType;
import spring.model.Exercise;

public class Running extends Exercise {
    public Running() {
        super();
        this.setType(ExerciseType.Running);
    }

    public Running(String name, ExerciseType type, String duration, String description, String picture) {
        super(name, type, duration, description, picture);
        this.setType(ExerciseType.Running);
    }

    public Running(Long id, String name, ExerciseType type, String duration, String description, String picture) {
        super(id, name, type, duration, description, picture);
        this.setType(ExerciseType.Running);
    }
}

