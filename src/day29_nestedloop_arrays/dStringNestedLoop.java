package day29_nestedloop_arrays;

public class dStringNestedLoop {
    public static void main(String[] args) {
        String word="java";
       /* String unique="";
        for (int i=0;i<word.length();i++){
            if (!unique.contains(word.charAt(i)+"")){
                unique += word.charAt(i);
            }
        }
        System.out.println(unique);*/
        for (int i=0;i<word.length();i++){
            for (int n=0; n<=i;n++){
                System.out.print(word.charAt(n));
            }
            System.out.println();
        }
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
        }
}
