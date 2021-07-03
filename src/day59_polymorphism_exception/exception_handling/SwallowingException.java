package day59_polymorphism_exception.exception_handling;

public class SwallowingException {
    public static void main(String[] args) {
        try {
            System.out.println("hello");
            System.out.println(5/0);
        }catch (Exception ignore){

        }
        System.out.println("How are you today?");
        System.out.println("We just suppresed/swallowed the runtime exception");
        System.out.println("Error is not happen, we just ignore it, Nobody knows about it");
    }
}
