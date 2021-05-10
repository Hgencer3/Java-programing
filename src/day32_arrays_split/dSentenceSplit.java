package day32_arrays_split;

public class dSentenceSplit {
    public static void main(String[] args) {
        String sentence="Java is fun";
        String[] words=sentence.split(" ");
        System.out.println("first word of sentence= " +words[0]);
        System.out.println("second word of sentence= " +words[1]);
        System.out.println("third word of sentence= " +words[2]);
        //System.out.println("forth word of sentence= " +words[3]);//outofbound

        for (String each:words){
            System.out.println(each);
        }
        String googleResult="About 1,810,000 results (0.68 seconds)";
        String[] result=googleResult.split(" ");
        System.out.println("count "+result[1]);
        System.out.println("Second= "+result[3].replace("(", ""));
        System.out.println("second= "+result[3].substring(1));



    }
}
