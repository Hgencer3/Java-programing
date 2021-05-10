package day42_arraylist;
import java.util.*;
public class aCollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters=new ArrayList<>();
        letters.addAll(Arrays.asList('j','a','v','a','i','s','f','u','n'));
        System.out.println("letters = " + letters.size());
        System.out.println(letters);

        Collections.reverse(letters);
        System.out.println(letters);
        //find count of a in letters
        System.out.println(Collections.frequency(letters,'a'));
        
        int vCount=Collections.frequency(letters,'v');
        System.out.println("vCount = " + vCount);

        System.out.println("Max char= "+Collections.max(letters));
        System.out.println("Min char= "+Collections.min(letters));

        Collections.reverse(letters);
        Collections.replaceAll(letters, 'a','u');
        System.out.println("after replaceAll= "+letters);

        Collections.sort(letters);
        System.out.println("after sort= "+letters);



    }
}
