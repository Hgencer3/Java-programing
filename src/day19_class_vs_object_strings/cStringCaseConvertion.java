package day19_class_vs_object_strings;

import java.util.Locale;

public class cStringCaseConvertion {
    public static void main(String[] args) {
        String word = "Cybertek";
        String sentence="Java is Funny";
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println("Cybertek".toLowerCase());
        System.out.println("CyberteK".toUpperCase());
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.toUpperCase());

        word.toLowerCase();
        System.out.println(word);
        
        String wordInLcase = word.toLowerCase();
        System.out.println("wordInLcase = " + wordInLcase);

        word = word.toLowerCase();
        System.out.println("word = " + word);

        String company= "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase - " + company.toUpperCase());
        System.out.println("java".toUpperCase());

        System.out.println("company = " +company);
        company = company.toUpperCase();
        System.out.println("company = " + company);


       }
}
