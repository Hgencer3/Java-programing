package repl_it;

import java.util.Scanner;

public class Shopping_List {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String tomates=scan.nextLine();
        String cheese=scan.nextLine();
        String apples=scan.nextLine();
        double priceTom=5.5;
        double priceChe=3.5;
        double priceApp=6.3;
        double totalPrice=priceTom+priceChe+priceApp;
        System.out.println("Item1: "+tomates+" Price: "+priceTom);
        System.out.println("Item1: "+cheese+" Price: "+priceChe);
        System.out.println("Item1: "+apples+" Price: "+priceApp);
        System.out.println(totalPrice);
    }
}
