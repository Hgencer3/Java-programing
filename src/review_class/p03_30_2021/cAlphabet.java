package review_class.p03_30_2021;

import java.util.Scanner;

public class cAlphabet {
    public static void main(String[] args) {
        /*
        [Dynamic alphabet]
• Write a program that will ask ‘upper’ or ‘lower’
• If it is upper: print the alphabet in all uppercase letter from A to Z • If it is lower: print the alphabet in all uppercase letter from a to z
- Challenge: Also ask if they want to show the alphabet in ascending or order descending
- Ascending:A–Z or a–z
- Descending:Z–A or z–a
*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want uppercase or lowercase");
        String upperOrLower = scan.next();
        System.out.println("Do you want it is ascending or descending");
        String ascendingOrDescending = scan.next();
        int starting;
        int ending;

        if (upperOrLower.equals("uppercase")) {
            starting = 'A';
            ending = 'Z';
        } else {
            starting = 'a';
            ending = 'z';
        }
        if (ascendingOrDescending.equals("ascending")) {
            for (int i = starting; i <= ending; i++) {//
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = ending; i >= starting; i--) {//
                System.out.print((char) i + " ");
            }
        }
    }
}

