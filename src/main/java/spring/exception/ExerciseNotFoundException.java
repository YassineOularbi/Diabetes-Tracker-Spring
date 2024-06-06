package spring.exception;

public class ExerciseNotFoundException extends RuntimeException{
    public ExerciseNotFoundException(){
        super("exercise not found !");
    }
}
