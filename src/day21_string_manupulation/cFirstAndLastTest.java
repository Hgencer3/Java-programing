package day21_string_manupulation;

public class  cFirstAndLastTest {
    public static void main(String[] args) {
        String word="mom";
        char first= word.charAt(0);
        char last=word.charAt(2);

        if (first==last){
            System.out.println("match");
        }else {
            System.out.println("its not matsch");
        }

        if (word.charAt(0)==word.charAt(2)){
            System.out.println("match");
        }else {
            System.out.println("its not match");
        }

        String friend="level";
        char firstLetter= friend.charAt(0);
        char lastLetter=friend.charAt(((friend.length())-1));
        if (firstLetter==lastLetter){
            System.out.println("match");
        }else {
            System.out.println("its not match");
        }

    }
}
