package spring.model.exercise;

import spring.enums.ExerciseType;
import spring.model.Exercise;

public class Cycling extends Exercise {
    public Cycling() {
        super();
        this.setType(ExerciseType.Cycling);
    }

    public Cycling(String name, ExerciseType type, String duration, String description, String picture) {
        super(name, type, duration, description, picture);
        this.setType(ExerciseType.Cycling);
    }

    public Cycling(Long id, String name, ExerciseType type, String duration, String description, String picture) {
        super(id, name, type, duration, description, picture);
        this.setType(ExerciseType.Cycling);
    }
}
