package day14_multi_branch_if_statement;

public class cMultiBranchIfStatement {
    public static void main(String[] args) {
        int day = 10;
        if (day == 1) {
            System.out.println("Monday");
        } else {
            System.out.println("not monday");
        }

        if (day == 2) {
            System.out.println("Tuesday ");
        } else if (day == 3) {
            System.out.println("Wednesday ");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }

        day =1;
        if (day == 1) {
            System.out.println("Monday");
        } else if (day==2){
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday ");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }

    }
}

