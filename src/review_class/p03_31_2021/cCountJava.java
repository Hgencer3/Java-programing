package review_class.p03_31_2021;

public class cCountJava {
    public static void main(String[] args) {
        String str="java is fun. java class today, not javascript";
        int count=0;
        while (str.contains("java")){
            count++;
            str=str.replaceFirst("java","");
        }
        System.out.println("Java was found "+count+" times");
    }
}