package review_class.p04_06_2021;

public class cPalinfrome {
    public static void main(String[] args) {
        String word="racecar";
        boolean isPalindrome=true;

        for (int i=0;i<word.length()/2;i++){
            if (word.charAt(i)!=word.charAt(word.length()-1-i)){
                isPalindrome=false;
                break;
            }
        }

        System.out.println(isPalindrome);
    }
}
