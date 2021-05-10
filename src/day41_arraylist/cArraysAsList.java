package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 1, 34, 54, 654);
        System.out.println("nums = " + nums);
        /* nums.add(100);
        nums.remove(0);
        nums.clear();*/
        List<Integer> numsList = new ArrayList<>(Arrays.asList(4, 2, 4, 23, 5344, 100));
        numsList.add(33);
        numsList.add(56);
        System.out.println("numsList = " + numsList);
        numsList.remove(0);
        numsList.remove(new Integer(23));
        System.out.println("numsList after meroves= " + numsList);

        //List String drinksWithCaffeine
        List<String> drinkWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull", "coke", "Mdew", "kambucha", "celcius"));
        int caffaineAmount = 0;

        for (int i = 0; i < drinkWithCaffeine.size(); i++) {
            if (drinkWithCaffeine.get(i).equals("monster") || drinkWithCaffeine.get(i).equals("red bull")
                    || drinkWithCaffeine.get(i).equals("celcius")) {
                System.out.println(drinkWithCaffeine.get(i) + " caffein amount is 150");
            } else if (drinkWithCaffeine.get(i).equals("coffee") || drinkWithCaffeine.get(i).equals("kambucha")) {
                System.out.println(drinkWithCaffeine.get(i) + " caffein amount is 150");
            } else if (drinkWithCaffeine.get(i).equals("tea") || drinkWithCaffeine.get(i).equals("coke")
                    || drinkWithCaffeine.get(i).equals("pepsi") || drinkWithCaffeine.get(i).equals("Mdew")) {
                System.out.println(drinkWithCaffeine.get(i) + " caffein amount is 35");
            }
        }

        System.out.println();
        for (int i = 0; i < drinkWithCaffeine.size(); i++) {
            switch (drinkWithCaffeine.get(i)) {
                case "monster":    case "red bull":      case "celcius":
                    System.out.println(drinkWithCaffeine.get(i) + " caffein amount is 150");
                    break;
                case "coffee":     case "kambucha":
                    System.out.println(drinkWithCaffeine.get(i) + " caffein amount is 112");
                    break;
                case "coke":       case "Mdew":           case "pepsi":      case "tea":
                    System.out.println(drinkWithCaffeine.get(i) + " caffein amount is 35");
                    break;

            }
        }
        //lamda expression
        drinkWithCaffeine.forEach(each -> System.out.println(each));

        drinkWithCaffeine.forEach(each -> {
            System.out.println("this is forEach block");
            System.out.println("drink = "+each);
        });

    }
}
