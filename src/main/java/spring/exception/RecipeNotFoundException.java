package spring.exception;

public class RecipeNotFoundException extends RuntimeException{
    public RecipeNotFoundException(){
        super("recipe not found !");
    }
}
