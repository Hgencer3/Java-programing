package day36_methods_with_return;

public class aCreditScore {
    public static void main(String[] args) {
        checkEligible(750);
        checkEligible(800);
        checkEligible(650);

        getCreditScore();//nothing printing out
        System.out.println(getCreditScore());
        checkEligible(getCreditScore());
        System.out.println("Credit Score= "+getCreditScore());
        int score = getCreditScore();
        System.out.println("score = "+score);
    }
    public static void checkEligible(int creditScore) {
        if (creditScore >= 700) {
            System.out.println("You are eligible for leasing this car");
        } else {
            System.out.println("Sorry! You are not eligible for leasing this car");
        }
    }
    public static int getCreditScore(){
        return 800;
    }

}
