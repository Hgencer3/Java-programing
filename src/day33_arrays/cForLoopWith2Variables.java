package day33_arrays;

public class cForLoopWith2Variables {
    public static void main(String[] args) {
        for (int i=1, j=1; i<=4;i++, j++){
            System.out.println("i= "+i+" j="+j);
        }
        System.out.println();
        for (int i=1, j=4; j>=1;i++, j--){
            System.out.println("i= "+i+" j="+j);
        }
    }
}
