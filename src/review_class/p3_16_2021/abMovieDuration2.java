package review_class.p3_16_2021;

import java.util.Scanner;

public class abMovieDuration2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the lenght of the movie");
        double movieLenght= input.nextDouble();
        double price=0;

        if(movieLenght==1){
            price = 8.99;

        }
        if(movieLenght==1.5){
            price=10.50;

        }
        if(movieLenght==2){
            price=12.99;

        }
        if(movieLenght==2.5){
            price=14.50;

        }
        if(movieLenght>=3){
            price=15.99;

        }
        if(movieLenght<=0){
            System.out.println("Invalid Lenght");

        }else {
            System.out.println("price = " + price);
        }
    }
}
