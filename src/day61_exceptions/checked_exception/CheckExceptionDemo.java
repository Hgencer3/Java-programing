package day61_exceptions.checked_exception;

public class CheckExceptionDemo {
    public static void main(String[] args)  {
        System.out.println("About to sleep for 3 seconds");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Woke up after 3 seconds");
    }
}
