package day40_arraylist;
import java.util.*;

public class cArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();//polymorphic way of declaring
        System.out.println(nums);//[] empty square bracket
        nums.add(34); nums.add(39);nums.add(39);nums.add(14);nums.add(11);nums.add(35);nums.add(64);
        nums.add(35);nums.add(44);nums.add(54);nums.add(22);nums.add(55);nums.add(74);nums.add(36);

        System.out.println("nums= "+nums);
        nums.remove(0); //remove index of 0
        System.out.println("nums= "+nums);
        nums.remove(new Integer(55));// remove 55 value not index
        System.out.println("nums= "+nums);

        //for loop-iterate through all values and print
        for (int i=0; i<nums.size();i++){
            System.out.print(nums.get(i)+" ");
        }
        System.out.println();
        //for each loop
        for (int each:nums) {
            System.out.print(each+" ");
        }

    }
}
