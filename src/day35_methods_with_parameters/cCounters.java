package day35_methods_with_parameters;

public class cCounters {
    public static void main(String[] args) {
        count(5);
        System.out.println();
        count(7);
        System.out.println();
        count(2);
        System.out.println();
        String word = "wooden spoon";
        count(word.length());
        System.out.println();
        printAge(1986);
    }

    public static void count(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
    }
    /*
     * method name: printAge
     * param: int year
     * print birth year
     */
    public static void printAge(int year) {
        System.out.print("Your age is " + (2021 - year));

    }
}




