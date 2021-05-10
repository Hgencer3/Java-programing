package day37_methods_overloading;

public class dOverloadMain {
    public static void main(String[] args) {
        System.out.println("Hello real main method.");
        main("I am Overload Main Method");
        main(5);
    }
    public static void main(String str){
        System.out.println(str);
    }
    public static int main(int num) {
        System.out.println("num= "+num);
        return num;
    }
}
