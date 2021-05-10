package day09_scanner_practice;
import java.util.Scanner;
public class iTempConverter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Fahrenheit:");
        double F= scan.nextDouble();
        int C= (int)(F-32)*5/9;
        System.out.println(F+"°F is "+C+"°C");
    }
}
