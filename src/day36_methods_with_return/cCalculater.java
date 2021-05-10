package day36_methods_with_return;

public class cCalculater {
    public static void main(String[] args) {

        System.out.println("Sum is: "+add(5.5, 4.5));
        System.out.println("Sum is: "+mines(5.5, 4.5));
        System.out.println("Sum is: "+multiple(5.5, 1.0));
        System.out.println("Sum is: "+divede(5.5, 1.1));
        System.out.println("100.0+200.0 = "+ add(100,200));
    }
    public static double add(double num1, double num2){
        double sum=num1+num2;
        return sum;
    }
    public static double mines(double num1, double num2){
        double sum=num1-num2;
        return sum;
    }
    public static double multiple(double num1, double num2){
        double sum=num1*num2;
        return sum;
    }
    public static double divede(double num1, double num2){
        double sum=num1/num2;
        return sum;
    }
}
