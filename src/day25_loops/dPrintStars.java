package day25_loops;

public class dPrintStars {
    public static void main(String[] args) {
        for (int i=1;i<=15;i++){
            System.out.print("*\u2606 ");
        }
        System.out.println();
        String myStrs="";
        for (int i=1; i<=5;i++){
            myStrs += "* ";
        }
        System.out.println("my Stars = "+myStrs);
    }
}
