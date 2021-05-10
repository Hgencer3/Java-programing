package day09_scanner_practice;
import java.util.Scanner;
public class kCentsToDollars {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter cents:");

        int cents = scan.nextInt();
        int dollars= 123/100;
        int remainCents= cents % 100;
        char cent1 = 189;

        System.out.println("in 123 cents: "+dollars+ "$ "+ remainCents+cent1);
    }
}
