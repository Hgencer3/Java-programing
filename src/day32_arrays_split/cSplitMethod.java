package day32_arrays_split;

import java.util.Arrays;

public class cSplitMethod {
    public static void main(String[] args) {

        String word= "java:python:selenium:html";
        String[] wordArray= word.split(":");
        System.out.println(wordArray[2]);
        System.out.println(Arrays.toString(wordArray));
        System.out.println("lenght of word array "+wordArray.length);

        for (String each:wordArray){
            System.out.println(each);
        }
        System.out.println();
        String sentence="today I am coding java arrays";
        String[] sentencesArray= sentence.split(" ");
        System.out.println("First word: "+sentencesArray[0]);
        System.out.println(Arrays.toString(sentencesArray));
        System.out.println("number of words in sentences "+sentencesArray.length);
        System.out.println("first word: "+sentence.split(" ")[0]);

        for (String each:sentencesArray){
            System.out.println(each);
        }
    }
}
