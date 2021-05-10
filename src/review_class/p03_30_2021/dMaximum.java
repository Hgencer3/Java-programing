package review_class.p03_30_2021;

import java.util.Scanner;

public class dMaximum {
    public static void main(String[] args) {
        /*[Max and Min from 5 numbers]
• Write a program that can ask the user "enter a number" five times and return the maximum number
• Write a program that can ask the user "enter a number" five times and return the minimum number
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 5 number");
int max=0;
int min=0;

        for (int i=0;i<5;i++){
            System.out.print("Enter number");
            int num=scan.nextInt();
            if (num>max){
                max=num;
            }
            if (num<min){
                min=num;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
