package day29_nestedloop_arrays;

public class fArraysIntro {
    public static void main(String[] args) {
        int num=10;//single variable
        int[] nums =new int[3] ;//array variable
        nums[0]= 5;
        nums[1]=10;
        nums[2]=7;
        System.out.println("value at index 0 = "+nums[0]);
        System.out.println("value at index 1 = "+nums[1]);
        System.out.println("value at index 2 = "+nums[2]);
        //System.out.println("value at index 3 = "+nums[3]);//ArrayIndexOutOfBoundsExceptions

        int i=0;
        System.out.println(nums[i]);
        i++;
        System.out.println(nums[i]);

        //how to find out the size of array
        System.out.println("number of elements = "+nums.length);
        //store lenght of array into len variable
        int len=nums.length;
        System.out.println("len = " + len);
        //change values in the array
        nums[0]=55;
        nums[1]=100;
        nums[2]=77;
        System.out.println("new value at index 0 = "+ nums[0]);
        System.out.println("new value at index 1 = "+ nums[1]);
        nums[2]=nums[1];
        System.out.println("new value at index 2 = "+ nums[2]);

    }
}
