package day40_arraylist;

import java.util.ArrayList;
import java.util.List;

public class aRawArrayList {
    public static void main(String[] args) {

                //Declare raw arraylist
        ArrayList list1= new ArrayList();
        List list2=new ArrayList();

        //add values
        list1.add("java");
        list1.add("apple");
        list1.add(1234);
        list1.add(152.3);
        list1.add(true);
        System.out.println("list1 = " + list1);
        System.out.println("size= "+list1.size());


    }
}
