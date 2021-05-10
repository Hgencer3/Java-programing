package day20_string_manupulation;

public class dStringReplace {
    public static void main(String[] args) {
        String word="java";
        System.out.println(word.replace("a","u"));

        String sentence="java strings is are fun";
        System.out.println(sentence);
        System.out.println(sentence.replace("a","u"));
        System.out.println(sentence);
        System.out.println(sentence.replace("strings","conditions"));
        System.out.println(sentence.replace("java",""));
    }
}
