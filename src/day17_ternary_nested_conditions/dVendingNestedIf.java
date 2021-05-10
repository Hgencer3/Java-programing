package day17_ternary_nested_conditions;

public class dVendingNestedIf {
    public static void main(String[] args) {
        String selection = "snack";
        String drink = "tea";
        String snack = "chips";
        if (selection.equals("drink")) {
            System.out.println("Drink is selected");
            if (drink.equals("tea")) {
                System.out.println("Tea is selected");
            } else {
                System.out.println(("Coke is selected"));
            }
        } else {
            System.out.println("Snack is selected");
            if (snack.equals("chips")) {
                System.out.println("Chips is selected");
            } else {
                System.out.println("Candy is selected");
            }
        }
    }
}