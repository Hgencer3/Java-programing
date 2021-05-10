package day16_switch_ternary;

public class cApartmentLease {
    public static void main(String[] args) {

        int numberOfBedrooms = 2;
        double startingPrice =0.00;

        System.out.println("************Welcome to Apartment of Haven***********");
        switch (numberOfBedrooms){
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1454.00;
                System.out.println("Price is $"+startingPrice);
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice = 1725.00;
                System.out.println("Price is $"+startingPrice);
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                startingPrice = 2899.00;
                System.out.println("Price is $"+startingPrice);
                break;
            default:
                System.out.println("5 bedroom currently not unavaible");
                return;

        }
    }

}
