package day39_wrapper_classes;

public class bAutoBoxingUnBoxing {
    public static void main(String[] args) {
        //auto-boxing : primitive --> object
        int num1=500;
        Integer num2=num1;
        Integer num3=234;

        //Un-boxing : object --> primitive
        Double d1= new Double(5.1);
        double d2=d1;
        double d3= new Double(345.3);

    }
}
