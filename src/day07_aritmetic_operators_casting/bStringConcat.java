package day07_aritmetic_operators_casting;

public class bStringConcat {
    public static void main(String[] args){
        int num1 = 5;
        int num2 = 3;
        System.out.println("java"+5+3);
        System.out.println("java"+(5+3));

        System.out.println("java"+num1+num2);
        System.out.println("java"+(num1+num2));

        System.out.println(5+3+"java"+5+3);
        System.out.println(5+(3+"java")+5+3);

        String str1 = "hello";
        String srt2 = " friends";
        System.out.println(str1+srt2);

        int num3 =7;
        int num4 =8;
        System.out.println(num3+num4);
        System.out.println(num3+" "+ num4);
        System.out.println(num3+""+ num4);

        char char1 = 'a';
        char char2 = 'b';
        System.out.println(char1+char2);
        System.out.println(""+ char1+char2);
    }
}
