package review_class.p3_16_2021;

public class afTriangleAngles {
    public static void main(String[] args) {

        int angleOne = 100;
        int angleTwo=30;
        int angleThree=50;
        int sum = angleOne + angleTwo +angleThree;

        if(sum==180){
            System.out.println("valid triangle ");
        }else {
            System.out.println("invalid triangle");
        }
        boolean check = (angleOne + angleTwo +angleThree) == 180;
        if(check){
            System.out.println("valid triangle ");
        }else {
            System.out.println("invalid triangle");
        }

        if((angleOne + angleTwo +angleThree) ==180){
            System.out.println("valid triangle ");
        }else {
            System.out.println("invalid triangle");
        }
    }
}
