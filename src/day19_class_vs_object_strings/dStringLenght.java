package day19_class_vs_object_strings;

public class dStringLenght {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("count = " + word.length());
        System.out.println("wooden spoon".length());
        String firstName = "Halil";
        System.out.println( firstName+"-"+firstName.length());
        
        int count=firstName.length();// lenght returns int value
        System.out.println("count = " + count);

        String password = "hello";

        if (password.length() >= 6){
            System.out.println("valid password");
        }else {
            System.out.println("password need at least character");
        }

        String word1="USA";
        if(word1.equals(word1.toUpperCase())){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
    }
}
