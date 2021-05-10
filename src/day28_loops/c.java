package day28_loops;

public class c {
    public static void main(String[] args) {
        String word="AAABBBCCC";
        String unique="";
       /* System.out.println(removeDup(word));
    }
    public static String removeDup(String word) {
        String result="";
        while (word.length()>0){
            if (!result.contains(word.substring(0,1))){
                result +=word.substring(0,1);
                word=word.replaceAll(word.substring(0,1),"");
            }
        }
        return result;*/

        for (int i=0;i<word.length();i++){
            if (!unique.contains(word.charAt(i)+"")){
                unique += word.charAt(i);
            }
        }
        System.out.println(unique);
    }
}
