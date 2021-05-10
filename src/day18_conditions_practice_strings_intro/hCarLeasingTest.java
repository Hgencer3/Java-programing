package day18_conditions_practice_strings_intro;

public class hCarLeasingTest {
    public static void main(String[] args) {
        String make = "mercedes";
        String model = "ClassC";
        double leasePrice = 500;

        if (make.equals("mercedes")) {
            System.out.println("Mercedes is selected");
            if (model.equals("ClassE")) {
                System.out.println("E-Class is selected");
                leasePrice = 500;
                System.out.println("leasePrice = " + leasePrice);
            } else {
                System.out.println("C-Class is selected");
                leasePrice = 400;
                System.out.println("leasePrice = $" + leasePrice);
            }
        } else {
            System.out.println("Audi is selected");
            if (model.equals("A3")) {
                System.out.println("A3 is selected");
                leasePrice = 300;
                System.out.println("leasePrice = $" + leasePrice);
            } else {
                System.out.println("SQ3 is selected");
                leasePrice = 600;
                System.out.println("leasePrice = $" + leasePrice);
            }
        }

    }
}

