package day60_exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {
        String word="java";

        try {
            //System.out.println(10/0);
            System.out.println("lenght = " + word.length());
            System.out.println(word.substring(20));
        }catch (NullPointerException n){
            System.out.println("NullPointerException caught and handled, please check if String has value");
        }catch (StringIndexOutOfBoundsException k){
            System.out.println("Index is wrong, please check if you entered a valid index");
        }catch (Throwable t){//Parent of all exceptions
            System.out.println("Exception is caught");
            System.out.println("Reason: "+t.getMessage());
        }
    }
}
