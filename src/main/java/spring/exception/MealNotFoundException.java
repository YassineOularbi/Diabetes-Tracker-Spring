package spring.exception;

public class MealNotFoundException extends RuntimeException{
    public MealNotFoundException(){
        super("meal not found !");
    }
}
