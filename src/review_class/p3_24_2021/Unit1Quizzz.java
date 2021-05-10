package review_class.p3_24_2021;


import java.util.Scanner;

public class Unit1Quizzz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean isTall=scan.nextBoolean();
        boolean isFast=scan.nextBoolean();
        boolean isFlexible=scan.nextBoolean();
        String sport="";
        if (isTall){
            if (isFast){
                sport="basketboll";
            }else if (isFlexible){
                sport="gym";
            }else {
                sport="vooley";
            }
        }else{
            if (isFast){
                sport="soccer";
            }else {
                sport="tennis";
            }
        }

        System.out.println(sport);


    }
}
