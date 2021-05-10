package day41_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dSortingList {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();
        nums.add(2);
        nums.add(32);
        nums.add(100);
        nums.add(654);
        nums.add(1);
        nums.add(32);
        System.out.println(nums);

        Collections.sort(nums);
        System.out.println("after sorting = "+nums);
    }
}
