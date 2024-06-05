package spring.model.exercise;

import spring.enums.ExerciseType;
import spring.model.Exercise;

public class Swimming extends Exercise {
    public Swimming() {
        super();
        this.setType(ExerciseType.Swimming);
    }

    public Swimming(String name, ExerciseType type, String duration, String description, String picture) {
        super(name, type, duration, description, picture);
        this.setType(ExerciseType.Swimming);
    }

    public Swimming(Long id, String name, ExerciseType type, String duration, String description, String picture) {
        super(id, name, type, duration, description, picture);
        this.setType(ExerciseType.Swimming);
    }
}
