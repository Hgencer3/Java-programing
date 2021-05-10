package day09_scanner_practice;

import java.util.Scanner;

public class bAskAgeVersion2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("how old are you:");
        int age = scan.nextInt();
        System.out.println(age + " -That's great age! ");
        long a=3_000l;
        double b = (float) a;
        System.out.println("b = " + b);
    }
}
