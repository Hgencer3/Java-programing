package day29_nestedloop_arrays;

public class e {
    public static void main(String[] args) {
        // hangi harften kac tane var
        String word="abbcccddddeeeeeffffff";
        for (int i=0;i<word.length();i++){
            System.out.println("outer:"+word.charAt(i));
            int count=0;
            for (int n=0; n<word.length();n++){
                if (word.charAt(i)==word.charAt(n)){
                    count++;
                }
            }
            System.out.println(word.charAt(i)+"="+count);

        }
    }
}
