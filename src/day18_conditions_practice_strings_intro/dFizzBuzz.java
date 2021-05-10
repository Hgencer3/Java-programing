package day18_conditions_practice_strings_intro;

public class dFizzBuzz {
    public static void main(String[] args) {
        int number=9;
        if (number%3==0 && number%5==0){
            System.out.println("FizzyBuzzy");
        }if (number%3==0 ){
            System.out.println("Fizzy");
        }if( number%5==0){
            System.out.println("Buzzy");
        }

    }
}
