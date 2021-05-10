package day33_arrays;

import java.util.Arrays;

public class eSplitReview {
    public static void main(String[] args) {
        String word="java";
        String[] array=word.split("a");
        System.out.println(array.length);
        System.out.println(Arrays.toString(array));
        int countOfA= array.length;
        //System.out.println("count of a="+countOfA);

        if (word.endsWith("a")){
            countOfA++;
        }
        System.out.println("count of a="+countOfA);

        System.out.println("-----Split with Empty String------");
        String[] strArr=word.split("");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);

        String word2="java1html2sql";
        String[] strArr2=word2.split("\\d");
        System.out.println(Arrays.toString(strArr2));

        word2=word2.replaceAll("\\d","_");
        System.out.println(word2);

        String password = "Abcd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }

    }
}
