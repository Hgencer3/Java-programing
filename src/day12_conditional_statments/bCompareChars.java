package day12_conditional_statments;

public class bCompareChars {
    public static void main(String[] args) {
        char letter1= 'A';
        char letter2= 'J';
        System.out.println(letter1==letter2);
        System.out.println(letter1>=letter2);
        System.out.println(letter1<=letter2);

        char grade = 'A';
        boolean pass = grade <= 'D';
        System.out.println("Did oyu pass the exem? -"+pass);

    }
}
