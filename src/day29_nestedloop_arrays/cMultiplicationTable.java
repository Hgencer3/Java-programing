package day29_nestedloop_arrays;

public class cMultiplicationTable {
    public static void main(String[] args) {
       /* for (int outer = 1; outer <= 10; outer++) {
            for (int inner = 1; inner <= 10; inner++) {
                System.out.println(inner + " x " + outer + " = " +inner * outer+" ");
            }
            System.out.println("\n");
        }*/
        for (int outer = 1; outer <= 10; outer++) {
            for (int inner = 1; inner <= 10; inner++) {
                System.out.print(inner*outer+"\t");
            }
            System.out.println("\n");
        }
    }
}
