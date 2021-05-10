package day25_loops;

import java.util.Scanner;

public class hStatEnd {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number");
        int start= scan.nextInt();
        System.out.println("Enter last number");
        int end= scan.nextInt();

        for(int i=start; i<=end;i++){
            System.out.print(i+" ");
        }

    }
}
