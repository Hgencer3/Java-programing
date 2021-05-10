package day28_loops;

public class aJavaCityCases {
    public static void main(String[] args) {
        int totalCases=0;
        int i=0;
        for ( i=1;i<=30;i++){
            if (i%7!=0){
                totalCases+=200;
                System.out.println(i+". day "+totalCases);
            }else {
                totalCases+=500;
                System.out.println(i+". day "+totalCases);
            }
            System.out.println(i+". day "+totalCases);
        }
        System.out.println("Java city 11/2021");

    }
}
