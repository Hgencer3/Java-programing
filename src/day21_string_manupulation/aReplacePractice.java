package day21_string_manupulation;

import java.util.Locale;

public class aReplacePractice {
    public static void main(String[] args) {
        String word="github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub","lab"));
        System.out.println("word = " + word);

        word = word.replace("hub","lab");
        System.out.println("word= "+word);
        // i->o   a->i --> gotlib
        System.out.println(word.replace("i","o").replace("a","i"));

        String sentence = "java is fun";
        // withNoSpaces
        System.out.println(sentence.replace(" ",""));
        String withNoSpaces=sentence.replace(" ","");
        System.out.println("withNoSpaces = " + withNoSpaces);
        //"java"->"selenium"  fun-> a lot of fun   assign back to sentence
        System.out.println(sentence.replace("java","selenium").replace("fun","a lot of fun"));
        sentence = sentence.replace("java","selenium").replace("fun","a lot of fun");
        System.out.println("sentence = " + sentence);
        
        String result = "1-48 of over 4,000 results for java book";
        result=result.replace("1-48 of over ","").replace(",","").replace(" results for java book","");
        System.out.println("result = " + result);
        //convert to string to int
        int count = Integer.parseInt(result);
        count++;
        System.out.println("count = " + count);


    }
}
