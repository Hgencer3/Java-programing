package day17_ternary_nested_conditions;

public class aTernaryExamples {
    public static void main(String[] args) {
        int score = 65;
        String result = score >= 60 ? "pass" : "fail";
        System.out.println("result = " + result);
        String quality = "Good";
        int x = (quality.equals("Good")) ? 100 : 0 ;
        System.out.println(x);
        score = 91;
        char grade = (score >90) ? 'A' : 'B';
        System.out.println("Grade ="+grade);
        score = 10;
        String evenodd = (score%2==0) ? "even" : "odd";
        System.out.println("score is "+ evenodd);
    }
}
