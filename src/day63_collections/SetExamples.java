package day63_collections;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {

        //Set is interface and HashSet is concrete class
        Set<Integer> set=new HashSet<>();
        //list -> ArrayList


        set.add(1);
        set.add(2);
        set.add(100);//unordered its means no indexes
        set.add(3);
        set.add(4);
        set.add(2);//not allow duplicate

        System.out.println(set);

        Set<String> words=new HashSet<>();
        words.add("hello");
        words.add("world");
        words.add("java");
        words.add("java");
        words.add("collection");
        words.remove("world");
        //words.get() -> we cant use get

        System.out.println(words);
        for (String str:words){//we cant use .remove inside the loop

        }

        //convert your Set to a List
        List<String> wordsList= new ArrayList<>(words);
        System.out.println(wordsList.get(0));
        wordsList.add("world"); //list anymore and allow duplicate
        System.out.println(wordsList);

        //LinkedHashSet
        Set<String> linkHashSet=new LinkedHashSet<>();
        linkHashSet.add("24");
        linkHashSet.add("java");
        linkHashSet.add("$#");
        linkHashSet.add("53");
        linkHashSet.add("java");//no duplicate
        linkHashSet.add("apple");
        linkHashSet.add("cucumber");
        System.out.println(linkHashSet);//no indexes thats why .get its not working


        Set<String> treeSet=new TreeSet<>();
        treeSet.add("24");
        treeSet.add("java");
        treeSet.add("$#");
        treeSet.add("53");
        treeSet.add("java");//no duplicate
        treeSet.add("apple");
        treeSet.add("cucumber");
        treeSet.add("Zumba");//uppercase before the lowercase
        System.out.println(treeSet);//natural order according to ascii table

    }
}
