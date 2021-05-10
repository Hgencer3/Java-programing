package day24_loops;

import java.util.Random;
import java.util.Scanner;

public class iGuessNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random randomNum=new Random();
        int secretNumber= randomNum.nextInt(50);
        int guessNumber;
        do {
            System.out.println("Guess the secret number");
            guessNumber=scan.nextInt();
            if (guessNumber>secretNumber){
                System.out.println("Wrong number is too large");
            }else if (guessNumber<secretNumber){
                System.out.println("Wrong number is too small");
            }
        }while (secretNumber!=guessNumber);
        System.out.println("Congrats, you won");
    }
}
