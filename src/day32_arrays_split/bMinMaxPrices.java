package day32_arrays_split;

import java.util.Arrays;

public class bMinMaxPrices {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        //find and print details of most expensive
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));

        double maxPrices=prices[0];
        double minPrices=prices[0];
        int indexOfMaxPrice=0;
        int indexOfMinPrice=0;

        for (int i = 0; i < items.length; i++) {
            if (prices[i] > maxPrices) {
                maxPrices=prices[i];
                indexOfMaxPrice=i;
            }
        }
        System.out.println("Max Prices is = " +maxPrices+ " items = "+ items[indexOfMaxPrice]);

            System.out.println();
        for (int i = 0; i < items.length; i++) {
            if (prices[i] < minPrices) {
                minPrices=prices[i];
                indexOfMinPrice=i;
            }
        }
        System.out.println("Min Prices is = " +minPrices+ " items = "+ items[indexOfMinPrice]);

    }
}
