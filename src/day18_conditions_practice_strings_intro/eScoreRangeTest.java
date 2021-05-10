package day18_conditions_practice_strings_intro;

public class eScoreRangeTest {
    public static void main(String[] args) {
        int score = 60;
        if (score>=1 && score <41){
            System.out.println("score is D.");
        }else if (score>=41 && score <61){
            System.out.println("score is C.");
        }else if (score>=61 && score <81){
            System.out.println("score is B.");
        }else if (score>=81 && score <=100){
            System.out.println("score is A");
        }else{
            System.out.println("invalid score");
        }
    }
}
