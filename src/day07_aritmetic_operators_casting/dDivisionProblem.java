package day07_aritmetic_operators_casting;

public class dDivisionProblem {
    public static void main(String[] args){
        System.out.println(10/3);
        System.out.println(5/2);
        int num1 = 40;
        int num2 = 15;
        System.out.println(num1/num2);

        System.out.println(5.0/2.0);
        System.out.println(5.0/2);
        double d1 = 12.0;
        double d2 = 5.0;
        System.out.println(d1/d2);
        int count = 100;
        double dcount = 30.0;
        System.out.println(count/dcount);

        int n1 =4;
        //byte b1 = n1;->Error int is larger data type than byte.
        byte b1 = (byte)n1; // now the above line byte n1 will CAST/CONVERT n1 to byte.

        byte b2= 55;
        int n2 = b2;// the above will work fine, since byte is smaller data. it will automatically cast

    }
}
