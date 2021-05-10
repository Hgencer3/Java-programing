package day34_void_methods;

public class cStartCar {
    public static void main(String[] args) {
        seatInCar();
        startTheCar();
        shiftTheDrive();
        pressTheGasPedal();
    }
    public static void pressTheGasPedal(){
        System.out.println("4.Hold Steering wheel and press gas pedal");
    }
    public static void seatInCar(){
        System.out.println("1.Open the door and seat in driver seat");
    }
    public static void startTheCar(){
        System.out.println("2. push the power button");
    }
    public static void shiftTheDrive(){
        System.out.println("3.Press brake pedal and gear to 'D'");
    }
}
