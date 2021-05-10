package day22_string_manupilation;

public class cStringSubstrings {
    public static void main(String[] args) {
        String word="hello";
        System.out.println(word.substring(0, 2));
        System.out.println(word.substring(1,4));
        System.out.println(word.substring(2,5));
        //StringIndexOutOfBoundsException
        //System.out.println(word.substring(2,8));//error
        System.out.println(word.substring(0));
        System.out.println(word.substring(2));
        System.out.println(word.substring(4));
        //StringIndexOutOfBoundsException
        //System.out.println(word.substring(10)); error

        String wrd = "java is fun";
        wrd=wrd.substring(0,4);
        System.out.println(wrd);

        // substring(startIndex) -- it will read from start until end
        String word2="hava funny";
        System.out.println(word2.substring(5));

    }
}
