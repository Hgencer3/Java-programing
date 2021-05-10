package day21_string_manupulation;

public class dStringIndexOf {
    public static void main(String[] args) {

        String word1= "github project";
        System.out.println(word1.indexOf("g"));
        System.out.println(word1.indexOf("u"));
        System.out.println(word1.indexOf("hub"));// which position is starting
        System.out.println(word1.indexOf("java"));//-1 if not correct gives -1
        System.out.println(word1.indexOf("t"));//2
        System.out.println(word1.indexOf("l"));//-1
        // if there is multiple g
        word1="gitghub";
        System.out.println(word1.indexOf("g"));
    }
}
