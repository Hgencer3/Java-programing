package day15_logicalops_switch_ternary;

public class fCarDealership {
    public static void main(String[] args) {
        int budget = 5000;
        String model = "Honda";
        int carPrice = 5500;

        if (((budget >= carPrice) && model.equals("Toyota")) ||
                ((budget >= carPrice) && model.equals("Honda")) ||
                ((budget >= carPrice) && model.equals("Tesla"))) {
            System.out.println("I will buy this " + model);
        }

        if (budget >= carPrice && (model.equals("Toyota") ||
                 model.equals("Honda")||
                   model.equals("Tesla"))){
            System.out.println("I will buy this " + model);
        }else{
            System.out.println("I am not interested this "+model);
        }

    }
}
