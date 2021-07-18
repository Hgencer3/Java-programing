package day63_collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples2 {
    public static void main(String[] args) {

        //id, person
        Map<Integer, Person> map=new HashMap<>();
        map.put(32,new Person("MJ", 32));
        map.put(null,new Person("", 0));
        map.put(12, new Person("Nick",10));

        System.out.println(map.get(32));
        System.out.println(map.get(31));
        System.out.println(map.get(null));
        System.out.println(map);

        Map<Integer, Person> map2=new LinkedHashMap<>();
        map2.put(32,new Person("MJ", 32));
        map2.put(null,new Person("", 0));
        map2.put(12, new Person("Nick",10));
        System.out.println(map2);

        Map<Integer, Person> map3=new TreeMap<>();
        map3.put(32,new Person("MJ", 32));
        map3.put(0,new Person("", 0));
        map3.put(12, new Person("Nick",10));
        System.out.println(map3);//treemap order to key ascending

        /*
                DataBase
                FIRST_NAME   James
                LAST_NAME    Bond
                AGE          50

                FIRST_NAME   Amy
                LAST_NAME    Rose
                AGE          30

                Map<String, String> map=new HashMap<>();
                map.put("FIRST_NAME", "James");
                map.put("LAST_NAME", "Bond");

                map.get("FIRST_NAME");

                if(map.get("AGE")<0) fail test case

                f(map.get("FIRST_NAME")== null) fail test case

                List<Map<String, String> list

                    list.get(0) -> Map<String, String> (James bond)
                    list.get(0).get("FIRST_NAME")  -> James

         */



    }
}
