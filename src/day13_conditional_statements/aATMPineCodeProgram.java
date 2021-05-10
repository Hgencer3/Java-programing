package day13_conditional_statements;

import java.util.Scanner;
public class aATMPineCodeProgram {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("***Welcome To TD Bank ATM***");
        System.out.println("Enter The Pin Number");
        int secretPinCode= 1234;
        int inputPincode= scan.nextInt();

        if(secretPinCode==inputPincode){
            System.out.println("Wellcome to Your Bank Account");
            System.out.println("You can withdraw, check balance, deposit");
        }else{
            System.out.println("Incorrect pin number\nPlease try again.");
        }


    }
}
