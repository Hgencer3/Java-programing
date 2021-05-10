package day07_aritmetic_operators_casting;

public class cOperatorPrecedence {
    public static void main(String[] args){
        System.out.println(10+5);
        System.out.println(10+5-3);
        System.out.println(10-5+3);
        System.out.println(10-(5+3));

        System.out.println(2*3);
        System.out.println(2*3/3);
        System.out.println(20/(2*2));

        System.out.println(2+5*3);
        System.out.println((2+5)*3);
        //System.out.println(10/0); diveded any number by 0,  error will happen

        double num1 = 5;
        double num2 = 2;
        System.out.println(num1/num2);//2.5
        System.out.println(5/2.0d);//2.5
        System.out.println(5.0/2.0);//2.5
    }
}
