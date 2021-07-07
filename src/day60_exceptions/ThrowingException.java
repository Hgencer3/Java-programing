package day60_exceptions;

public class ThrowingException {
    public static void main(String[] args) {
        System.out.println("Lets create exceptions");

//        RuntimeException exception=new RuntimeException();
//
//        throw exception;//manually create the runtime exception

       // throw new RuntimeException();//manually create the runtime exception
    String username="";
    if (username.isEmpty()){
        throw new RuntimeException("Username cannot be empty");
    }
    }
}
