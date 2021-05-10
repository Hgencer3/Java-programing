package review_class.p3_29_2021;

public class aMiddleChart {
    public static void main(String[] args) {
        //String in orta noktasini(middle) bulma
        // kelime tek sayi ise orta noktasi tek hecedir.
        // kelime cift sayi is orta noktasi iki hecedir.
        String word= "even";
        if (word.length()%2==1){
            //odd
            System.out.println(word.charAt(word.length()/2));
            System.out.println(word.substring(word.length()/2, word.length()/2+1));

        }else {
            //even
            System.out.println(word.charAt(word.length()/2-1)+""+word.charAt(word.length()/2));
            System.out.println(word.substring(word.length()/2-1, word.length()/2+1));

        }
    }
}
