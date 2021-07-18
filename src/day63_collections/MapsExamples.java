package day63_collections;

import java.util.HashMap;
import java.util.Map;

public class MapsExamples {
    public static void main(String[] args) {

        //id (have to be unique, names
        Map<Integer, String> map=new HashMap<>();
        map.put(1,"james");
        map.put(2,"Anna");
        map.put(2,"Daria");
        map.put(100,"maxim");

        System.out.println(map);

        System.out.println(map.get(2));
        System.out.println(map.get(50));

        map.remove(1);
        System.out.println(map);
        map.put(1,"Kinga");
        System.out.println(map);
        map.remove("maxim");//its not working
        System.out.println(map);

        for (Integer key: map.keySet()){
            System.out.println(key+" - "+map.get(key));
            if (map.get(key).equals("Daria")){
                System.out.println("this is our key"+key);
            }
        }
    }


}
