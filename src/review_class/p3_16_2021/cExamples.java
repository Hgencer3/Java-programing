package review_class.p3_16_2021;

public class cExamples {
    public static void main(String[] args) {
        int a=10;
        int b= a-- * 2 - --a % 2 + a ;
        //  b=  10  * 2 -  8  % 2 + 8 ;
        //  b=     20  -   0    + 8;
        // b = 208+8 = 28
        System.out.println(b);

        // even and odd
        if (11%2==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }

    }
}
