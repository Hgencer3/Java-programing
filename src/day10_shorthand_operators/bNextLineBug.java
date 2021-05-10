package day10_shorthand_operators;
import java.util.Scanner;

public class bNextLineBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rent values?");
        double rent = scan.nextDouble();
        System.out.println();
        System.out.println("Which month?");//Glitch means:new line charecter end ignore the text
        String month = scan.nextLine();
        //String month2 = scan.nextLine(); if bos bir scan.nextLine(); objesi birakirsak duzelir
        System.out.println(rent);
        System.out.println(month);
    }
}
