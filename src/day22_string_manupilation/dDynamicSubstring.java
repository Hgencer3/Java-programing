package day22_string_manupilation;

public class dDynamicSubstring {
    public static void main(String[] args) {
        String results="result count:12345";
        System.out.println(results.substring(13));

        //find the index of ":"
        System.out.println(results.indexOf(":"));
        int colonIndex = results.indexOf(":");
        System.out.println(results.substring(colonIndex+1));
        // now we combine them into 1 statemnet
        System.out.println(results.substring(results.indexOf(":") +1 ));

        String today ="I learn [selenium] today";
        //find index of [ ] and provide them as star, end index for substring to print java
        System.out.println(today.substring(today.indexOf("[")+1,today.indexOf("]")));
        //second way
        int start= today.indexOf("[");
        int end = today.indexOf("]");
        System.out.println(today.substring(start+1, end));
    }
}
