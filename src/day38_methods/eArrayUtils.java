package day38_methods;

import java.util.Arrays;

public class eArrayUtils {
    public static void main(String[] args) {

    }
    public static void printArray(int[] nums){
        for (int num: nums) {
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static int sum(int[] nums){
        int sum=0;
        for (int num:nums){
            sum += num;
        }
        return sum;
    }

    public static boolean contains(int[] nums, int num) {

        for (int each : nums) {
            if (each==num){
                return true;
            }
           }
          return false;
    }
    public static boolean equalty(int[] a, int[] b){
        if (Arrays.equals(a,b)){
            return true;
        }
        return false;
    }
}
