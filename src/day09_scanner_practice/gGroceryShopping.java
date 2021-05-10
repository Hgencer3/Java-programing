package day09_scanner_practice;
import java.util.Scanner;
public class gGroceryShopping {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter price for milk:");
        double priceMilk= scan.nextDouble();
        System.out.println("Enter price for bread:");
        double priceBread= scan.nextDouble();
        System.out.println("Enter price for cucumbers:");
        double priceCucumber= scan.nextDouble();
        System.out.println("Total price is: "+ (priceBread+priceMilk+priceCucumber));
    }
}
