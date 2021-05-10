package day36_methods_with_return;

import java.util.Random;

public class bInfo {
    public static void main(String[] args) {
        System.out.println("What is his name= " +fullName());
        System.out.println("Is married-"+isMarried());
        System.out.println("How Old is he- "+getAge());
        System.out.println(fullName2().toUpperCase());

        System.out.println(getRandomYear());
    }
    public static String fullName(){
        return "Mike Smith";
    }
    public static boolean isMarried(){
        return false;
    }
    public static int getAge(){
        return 35;
    }
    public static String fullName2() {
        System.out.println("What is his name");
        return "Adam Smith";
    }
    public static int getRandomYear() {
        Random random = new Random();
        int randomYear=random.nextInt(2021);
        return randomYear;
    }
}
