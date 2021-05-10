package day38_methods;

public class bRecursiveMethods {
    public static void main(String[] args) {
        print1To100(1);

    }
    public static void print1To100(int num){
        System.out.print(num+" ");
        num++;
        if (num <=100){
            print1To100(num);//methods call itself

        }
    }

}
