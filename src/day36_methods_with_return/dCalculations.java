package day36_methods_with_return;

public class dCalculations {
    public static void main(String[] args) {
        System.out.println(cCalculater.add(5.5,4.5));
        System.out.println(cCalculater.mines(5.5,4.5));
        System.out.println(cCalculater.multiple(5.5,1.0));
        System.out.println(cCalculater.divede(5.5,1.1));
        
        double d1=234.3;
        double d2=321.5;
        double result=cCalculater.mines(d1,d2);
        System.out.println("result = " + result);
    }

}
