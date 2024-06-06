package spring.exception;

public class MedicationNotFoundException extends RuntimeException{
    public MedicationNotFoundException(){
        super("medication not found !");
    }
}
