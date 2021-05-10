package day10_shorthand_operators;
import java.util.Scanner;
public class aWeatherToday {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How is the weather today?");
        String weather= scan.nextLine();// very cold
        System.out.println("Weather is "+weather+" today!");

        System.out.println("How is the weather today?");
        String weather2= scan.next();// very hot next oldugu icin sadece bir kelime yazdirir
        System.out.println("Weather is "+weather2+" today!");
    }
}
