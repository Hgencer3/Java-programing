package day09_scanner_practice;
import java.util.Scanner;
public class fSpeedCheckV2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your current speed:");
        int currentSpeed = scan.nextInt();
        int speedLmimit= 70;
        int overTheLimit= speedLmimit-currentSpeed;
        System.out.println("Your speed is "+ overTheLimit+"mph over the speed limit.");
    }
}
