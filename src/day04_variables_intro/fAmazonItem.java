package day04_variables_intro;

public class fAmazonItem {
    public static void main(String[] args){
        String description = "HIC wooden spoon";
        int ratingCount = 181;
        double price = 5.99;
        String seller = "Amazon";
        boolean prime = true;

        System.out.println("---Product Information---");
        System.out.println(description);
        System.out.print(" *****");
        System.out.println(ratingCount);
        System.out.println(price);
        System.out.println(prime);

    }
}
