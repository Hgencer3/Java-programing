package review_class.p3_16_2021;

public class afGradeRetake {
    public static void main(String[] args) {

        int baseGrade = 90;
        int numberOfAttemps = 2;
        int retakePenalty = 0;

        if (numberOfAttemps == 1) {
            retakePenalty = (int) (baseGrade * .10);
        }
        if (numberOfAttemps == 2) {
            retakePenalty = (int) (baseGrade * .20);
        }
        if (numberOfAttemps == 3) {
            retakePenalty = (int) (baseGrade * .35);
        }
        System.out.println("Grade after retake attempt"+ numberOfAttemps + " was: "+
                (baseGrade - retakePenalty));
    }
}
