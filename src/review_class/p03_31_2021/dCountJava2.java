package review_class.p03_31_2021;

public class dCountJava2 {
    public static void main(String[] args) {

        String str = "java is fun. java class today, not javascript";
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            String eachFourLetter = str.substring(i, i + 4);
            if (eachFourLetter.equals("java")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
