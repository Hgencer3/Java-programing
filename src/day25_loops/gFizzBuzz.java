package day25_loops;

public class gFizzBuzz {
    public static void main(String[] args) {

        for (int n = 1; n <= 100; n++) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println(n + " FizzyBuzzy ");
            } else if (n % 3 == 0) {

                System.out.println(n + " Fizzy ");
            } else if (n % 5 == 0) {

                System.out.println(n + " Buzzy ");
            } else {
                System.out.println(n);
            }
        }
        //second way
        for (int n = 1; n <= 100; n++) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println(n + " FizzyBuzzy ");
            }
        }
        for (int n = 1; n <= 100; n++) {
            if (n % 3 == 0) {
                System.out.println(n + " Fizzy ");
            }
        }
        for (int n = 1; n <= 100; n++) {
            if (n % 5 == 0) {
                System.out.println(n + " Buzzy ");
            }
        }
    }
}
