package day25_loops;

import java.util.Scanner;

public class cForLoopPincode {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int secretCode=1234;
        System.out.println("Enter pin code");
        int pincode=scan.nextInt();
        for (;pincode!=secretCode;){
            System.out.println("Please try again");
            pincode=scan.nextInt();
        }
        System.out.println("Access success");
    }
}
