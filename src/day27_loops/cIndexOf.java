package day27_loops;

public class cIndexOf {
    public static void main(String[] args) {
        String word = "github";
        char letter = 'g';
        int index = -1;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                index = i;
                System.out.println(letter + " is found at index " + index);
              //  break;//exit for loop
            }
        }
        if (index==-1) {
            System.out.println(letter + " its not present");
        }else{
            System.out.println(letter +" is found at index " + index);
        }

    }
}
