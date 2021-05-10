package day37_methods_overloading;

import java.util.Arrays;

public class eVarArgs {
    public static void main(String[] args) {
        addNumbers(5);
        addNumbers(5,5);
        addNumbers();
        addNumbers(5,5,5,5,5,5,5);
    }
    public static void addNumbers(int... nums){
        int sum=0;
        for (int n:nums) {
            sum+=n;
        }
        System.out.println("sum = " + sum);
        System.out.println(Arrays.toString(nums));
    }
}
