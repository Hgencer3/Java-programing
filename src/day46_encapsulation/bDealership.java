package day46_encapsulation;

public class bDealership {
    public static void main(String[] args) {
        aCar car=new aCar();
        car.setModel("Honda Pilot");
        car.setMileage(101_200.3);
        car.setYear(2011);

        System.out.println("Blue car is "+ car.getYear()+" "+ car.getModel()+", mileage is "+ car.getMileage());

        aCar car2=new aCar();
        car2.setModel("Nissan Altima");
        car2.setMileage(1_220.3);
        car2.setYear(2015);

        System.out.println("Red car is "+ car2.getYear()+" "+ car2.getModel()+", mileage is "+ car2.getMileage());

        System.out.println(car.toString());
        System.out.println(car);//automatically calls toString
    }
}
