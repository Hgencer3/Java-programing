package review_class.p3_16_2021;

public class adOperatorAnalyze {
    public static void main(String[] args) {

        int a=5;
        int b= a++ + a-- + a*2 + a + ++a ;
        System.out.println(a);
        System.out.println(b);


        int c=200;
        int d= -c++ + - --c * c-- %2 + c ;
        System.out.println(c);
        System.out.println(d);

        int e=10;
        int f= e - 5 * 2 + e / 2 ;
        System.out.println("e = " + e);
        System.out.println("f = " + f);

    }
}
