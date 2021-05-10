package day09_scanner_practice;
import java.util.Scanner;
public class dSalaryCalculater {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter hourly rate");
        double hourlyRate = scan.nextDouble();
        double weeklyPay = 40*hourlyRate;
        double netWeeklyPay= weeklyPay-(weeklyPay*0.24);
        double montlyPay = 52/12*netWeeklyPay;
        double annualPay = 52*netWeeklyPay;
        System.out.println("Your Weekley Net Pay: $"+ netWeeklyPay);
        System.out.println("Your Montly Net Pay: $"+ montlyPay);
        System.out.println("Your Annual Net Pay: $"+ annualPay);

    }
}
