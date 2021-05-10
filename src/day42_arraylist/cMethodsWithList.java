package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cMethodsWithList {
    public static void main(String[] args) {
        printStrList(Arrays.asList("word","apple","coffee","tea","coke","Mdew"));

        System.out.println("sum= "+sumIntegerList(Arrays.asList(1,2,3,4,5,6,7,8,-9)));
    }
    public static void printStrList(List<String> strings){
        List <String> printStrList=new ArrayList<>();

        for(String each:strings){
            System.out.print(each+" ");
        }
        System.out.println();

    }
    public static int sumIntegerList(List<Integer> integerList){
        List<Integer> sumIntegerList=new ArrayList<>();
        int sum=0;
        for (int each:integerList){
            sum += each;
        }
        return sum;
    }
}
