package day50_inheritance;

public class AudioBook extends Book {
    double lenght;
    String narrator;
    public void listen(){
        System.out.println("Audio Book is listining");
        System.out.println("title = " + title);
        System.out.println("Author: "+author);
        System.out.println("price = " + price);
        System.out.println("lenght: "+lenght);
        System.out.println("Narrator: "+narrator);
    }

}
