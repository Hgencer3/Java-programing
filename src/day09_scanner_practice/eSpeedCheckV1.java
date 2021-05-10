package day09_scanner_practice;

public class eSpeedCheckV1 {
    public static void main(String[] args) {
        int speedLimit = 55;
        int currentSpeed= 70;
        int overTheLimit = currentSpeed-speedLimit;
        System.out.println("Your speed is "+ overTheLimit+"mph over the speed limit.");
    }
}
