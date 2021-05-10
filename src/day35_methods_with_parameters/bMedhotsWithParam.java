package day35_methods_with_parameters;

public class bMedhotsWithParam {
    public static void main(String[] args) {
        displayValue(5);
        displayValue(3);
        int count=55;
        displayValue(count);
        displayValue2(5, "Hello world");

    }
    public static void displayValue(int num){
        System.out.println("value is "+num);
    }
    public static void displayValue2(int num,String word){
        System.out.println("value is "+num);
        System.out.println("word is "+word);

    }
}
