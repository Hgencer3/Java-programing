package day13_conditional_statements;

public class cBonusCalculator {
    public static void main(String[] args) {

        int bonus = 0;
        double saleAmount = 500.55;
        if (saleAmount <= 1000) {
            bonus = 50;
            System.out.println("Great job, your bonus is: $" + bonus);
        } else {
            bonus = 100;
            System.out.println("Great job, your bonus is: $" + bonus);
        }
        //auto format shortcut in intellij
        //ctrl+alt+shift+L
    }
}
