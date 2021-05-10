package day25_loops;

public class eSumOfNumber {
    public static void main(String[] args) {

        int sum=0;
        for (int count=1;count<=5;count++){
            sum += count;
            System.out.println(sum);
        }
        sum=1;
        for (int count=1;count<=5;count++) {
            sum *= count;
            System.out.println(sum);
        }
    }
}
