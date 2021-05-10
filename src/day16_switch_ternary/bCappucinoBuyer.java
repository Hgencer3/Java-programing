package day16_switch_ternary;

public class bCappucinoBuyer {
    public static void main(String[] args) {
        String size="grande";
        double price = 0.00;
        int calories = 0;

        switch (size){
            case "tall":
                System.out.println("Tall Cappucino  please");
                price = 3.69;
                calories= 90;
                System.out.println("Price is $"+price);
                System.out.println("Calories is "+calories);
                break;
            case "grande":
                System.out.println("Grande Cappucino  please");
                price = 3.99;
                calories= 120;
                System.out.println("Price is $"+price);
                System.out.println("Calories is "+calories);
                break;
            case "venti":
                System.out.println("Venti Cappucino  please");
                price = 4.29;
                calories= 150;
                System.out.println("Price is $"+price);
                System.out.println("Calories is "+calories);
                break;
            default:
                System.out.println("We dont serve that size of cappicino");

        }
    }
}
