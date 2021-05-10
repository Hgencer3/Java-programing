package day31_Arrays;

import java.util.Arrays;
import java.util.Collections;

public class bArraysUtil {
    public static void main(String[] args) {
        int[] nums={5 , 2 , 7 , 3 , 9};

        System.out.println("nums[] = "+ Arrays.toString(nums));
        //sort nums
        Arrays.sort(nums);
        System.out.println("nums[] = " + Arrays.toString(nums));

        System.out.println("min value= " + nums[0]);
        System.out.println("max value= " + nums[nums.length-1]);

        String[] words={"A", "C", "D", "B","E"};
        Arrays.sort(words);
        System.out.println("words= "+Arrays.toString(words));

        Arrays.sort(words, Collections.reverseOrder());
        System.out.println("words= "+Arrays.toString(words));
        System.out.println("words= ["+String.join(", ", words)+"]");

        Arrays.sort(words);
        System.out.println("words= "+Arrays.toString(words));

    }
}
