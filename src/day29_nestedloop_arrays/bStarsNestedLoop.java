package day29_nestedloop_arrays;

public class bStarsNestedLoop {
    public static void main(String[] args) {
       /* for (int times = 1; times <= 5; times++) {
            System.out.println("\n");
            for (int stars = 0; stars <= 10; stars++) {
                System.out.print("* ");
            }
        }*/
        for (int times = 1; times <= 10; times++) {

            for (int stars = 1; stars <= times; stars++) {
                System.out.print("* " );
            }
            System.out.println();
        }
    }
}
