package day10_shorthand_operators;

public class dChangeBalance {
    public static void main(String[] args) {
        double balance= 1230.55;
        System.out.println("balance = " + balance);
        double baklavaPrice= 22.50;
        System.out.println("baklavaPrice = " + baklavaPrice);
        balance= balance-baklavaPrice;
        System.out.println("balance after baklava = " + balance);
        double kenafa= 44.45;
        System.out.println("kenafa = " + kenafa);
        balance= balance-kenafa;
        System.out.println("balance after kenafa = " + balance);
        kenafa = kenafa/2;
        System.out.println("second kenafa = " + kenafa);
        balance = balance - kenafa;
        System.out.println("balance after second kenafa = " + balance);
        double plov = 7.99;
        System.out.println("plov = " + plov);
        balance = balance-plov;
        System.out.println("balance after plov = " + balance);
        double icedTea= 3.0;
        System.out.println("icedTea = " + icedTea);
        balance = balance - (icedTea*4);
        System.out.println("balance after iced teas = " + balance);
        System.out.println("returning baklava= " + baklavaPrice);
        balance = balance + baklavaPrice;
        System.out.println("balance after returning baklava = " + balance);

    }
}
