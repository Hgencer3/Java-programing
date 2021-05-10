package day31_Arrays;
import java.util.*;
public class cBinarySearch {
    public static void main(String[] args) {
        int[] nums={-5,  23, 123, 654, 2344, 12345, 14421};
        System.out.println(Arrays.binarySearch(nums, 123));//indexOf islevini goruyor
        System.out.println(Arrays.binarySearch(nums, 2344));
        System.out.println(Arrays.binarySearch(nums, 25));//-2 yeri neresiyse iki ust sayisinin negatif hali
        System.out.println(Arrays.binarySearch(nums, 655));//-4 yeri neresiyse iki ust sayisinin negatif hali
        System.out.println(Arrays.binarySearch(nums,-5));

        if (Arrays.binarySearch(nums, 12345)>=0){
            System.out.println("12345 is present in array");
        }else{
            System.out.println("12345 is not present in array");
        }
    }
}
