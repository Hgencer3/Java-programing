package day32_arrays_split;

public class gReverseSentence {
    public static void main(String[] args) {
        String sentence="Java is fun";
        String[] sentenceArray=sentence.split(" ");
        String reversed="";
        for (int i= sentenceArray.length - 1;i>=0;i--){
           // System.out.println(sentenceArray[i]+" ");
            reversed +=sentenceArray[i] + "";
        }
        System.out.println("sentences = "+sentence);
        System.out.println("Reversed = "+reversed.trim());

        String word="Word";
        String[] letters=word.split("");
        System.out.println(letters[0]);
        String word2="Java";
        char[] letter2=word2.toCharArray();
        System.out.println(letter2[0]);

    }
}
