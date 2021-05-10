package day40_arraylist;
import java.util.ArrayList;
import java.util.*;
public class bArrayListExamples {
    public static void main(String[] args) {

        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(11);

          //nums.add(11,5);--> indexofoutboundsexception
        System.out.println("nums size= "+nums.size());
        System.out.println("nums "+nums);
        System.out.println("first value is "+ nums.get(0));

        nums.remove(1);//remove element at index 1
        System.out.println(nums);



    }
}
