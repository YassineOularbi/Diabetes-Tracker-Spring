package spring.exception;

public class DoctorNotFoundException extends RuntimeException{
    public DoctorNotFoundException(){
        super("doctor not found !");
    }
}
