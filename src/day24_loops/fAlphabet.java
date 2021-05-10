package day24_loops;

public class fAlphabet {
    public static void main(String[] args) {
        char alphabet ='a';
        while (alphabet<='z'){
            System.out.print(alphabet+" ");
            alphabet++;
        }
        System.out.println("");
        alphabet='z';
        while (alphabet>='a') {
            System.out.print(alphabet+" ");
            alphabet--;
        }
    }
}
