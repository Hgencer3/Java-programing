package day28_loops;

public class dBreakVsContinue {
    public static void main(String[] args) {
        //Break statement
        for (int n=1;n<=5;n++) {
            System.out.print(n);
            if (n == 3) {
                break;
            }
        }
        //Continue statement
        System.out.println();
        for (int i=1;i<=5;i++) {
            if (i == 2 || i==4) {
                continue;
            }
            System.out.print(i);
        }
    }
}
