package day18_conditions_practice_strings_intro;

public class fThreeNumber {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 5;
        int num3 = 100;

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Biggest number is " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Biggest number is " + num2);
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println("Biggest number is " + num3);
        }
    }
}
