package day12_conditional_statments;

public class aComparasionExamples {
    public static void main(String[] args) {
        int currentSpeed =45;
        int speedLimit= 55;
        boolean isSpeeding= currentSpeed > speedLimit;
        System.out.println("Are you speeding - " + isSpeeding);

        currentSpeed +=20;
        isSpeeding= currentSpeed > speedLimit;
        System.out.println("Are you speeding - " + isSpeeding);

        double accountBalance= 250.25;
        double itemPrice= 100.99;
        System.out.println("can afford "+ (accountBalance>=itemPrice));
    }

}
