package day61_exceptions.exceptions;

public class CustomExceptionClass {
    public static void main(String[] args) {
        int minutes=40;
        System.out.println("Class is going on for "+minutes+" minutes");
        if (minutes>50){
            throw new BreakTimeException("It is break time");
        }
        System.out.println("Lets continue class");
    }
}
