package day24_loops;

import java.util.Scanner;

public class hPinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int secretCode=1234;
        int pincode;
        do {
            System.out.println("Enter PinCode");
            pincode=scan.nextInt();

        }while (pincode!=secretCode);
        System.out.println("Access success");

    }
}
