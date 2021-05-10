package day12_conditional_statments;
import java.util.Scanner;
public class dAmazonFreeShiphing {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your orde price please");
        double Price= scan.nextDouble();
        if (Price>=25.00){
            System.out.println("You order eligible for free shipping");
        }else{
            System.out.println("You order not eligible for free shipping");
            System.out.println("Shiphing is 5.99$");
        }
    }
}
