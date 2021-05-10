package day09_scanner_practice;
import java.util.Scanner;
public class cAddNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1 = scan.nextInt();
        System.out.println("Please enter second number");
        int num2 = scan.nextInt();
        System.out.println("The sum is:" + (num1 + num2));
    }
}
