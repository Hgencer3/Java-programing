package day14_multi_branch_if_statement;
import java.util.Scanner;
public class gCalculaterV2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number");
        double num1= scan.nextDouble();
        System.out.println("Enter first number");
        double num2= scan.nextDouble();

        System.out.println("Please select operator ");

        //char operator='*';
        char operator=scan.next().charAt(0);

        if (operator=='+'){
            System.out.println("result "+ (num1+num2));
        }else if (operator=='-'){
            System.out.println("result "+ (num1-num2));
        }else if (operator=='*'){
            System.out.println("result "+(num1*num2));
        }else if (operator=='/'){
            System.out.println("result "+(num1/num2));
        } else{
            System.out.println("invalid operator");
        }

    }
}
