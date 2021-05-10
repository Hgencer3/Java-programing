package review_class.p3_16_2021;
import java.util.Scanner;

public class aaMovieDuration {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the lenght of the movie");
        double movieLenght= input.nextDouble();
        double price=0;

        if(movieLenght==1){
            price = 8.99;
            System.out.println("Price: "+ price);
        }
        if(movieLenght==1.5){
            price=10.50;
            System.out.println("price = " + price);
        }
        if(movieLenght==2){
            price=12.99;
            System.out.println("price = " + price);
        }
        if(movieLenght==2.5){
            price=14.50;
            System.out.println("price = " + price);
        }
        if(movieLenght==3){
            price=15.99;
            System.out.println("price = " + price);
        }


    }
}
