package day11_comparison_operators;

public class bBooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10==10);
        System.out.println(1000>100);
        System.out.println(985.44<98547.8);
        System.out.println(10<=11);
        System.out.println(5>=3);
        System.out.println(-5!=44);

        int a = 100;
        int b = 200;
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a!=b);
        
        boolean results;
        results = 5 == 5;
        System.out.println("results = " + results);
        results = 33>44;
        System.out.println("results = " + results);
        results = 88 < 99;
        System.out.println("results = " + results);
        results = 10>= 10;
        System.out.println("results = " + results);
        results = 123<=124;
        System.out.println("results = " + results);
        results = 2!=2;
        System.out.println("results = " + results);

        String city = "Seattle";
        System.out.println(city == "Seattle");
        System.out.println(city !="Fairfax" );

        String name= "Nadir";
        boolean checkName = name == "Nadir";
        System.out.println("checkName = " + checkName);

    }
}
