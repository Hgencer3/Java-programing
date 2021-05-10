package day23_string_manupulation_while_loop;

import java.util.Locale;

public class bChainingStringMethod {
    public static void main(String[] args) {
        String word="woo den sp oon";
        System.out.println(word.toUpperCase().toLowerCase().length());
        System.out.println(word.toUpperCase().replace(" ",""));

        String city="kAbUl";
        System.out.println(city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase());
        String capitalized=city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase();
        System.out.println("capitalized = " + capitalized);

        String str="AAABBBCCC";
        str=str.replace("AABBBCC"," ").replace(" ","B");
        System.out.println(str);
    }
}
