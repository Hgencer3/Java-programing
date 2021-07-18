package day63_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExamples {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        list.add("John");
        list.add("Jamie");
        list.add("Jorege");
        System.out.println(list);

        Iterator<String> iterator= list.iterator();

       iterator.next();
       iterator.remove();
        System.out.println(list);

        Set<String> names =new HashSet<>();
        names.add("James");
        names.add("Kinga");
        names.add("mj");
        names.add("John");
        names.add("Parvin");

        Iterator<String> iterator1=names.iterator();

        while (iterator.hasNext()){

            String currentName = iterator.next();
            System.out.println(currentName);

            if(currentName.length() < 3 || currentName.startsWith("j")){
                iterator.remove();
            }

        }


        System.out.println(names);
    }
    }

