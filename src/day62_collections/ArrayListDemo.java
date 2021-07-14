package day62_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> demoArrayList=new ArrayList<>();
        List<String> demoArrayList2=new ArrayList<>();//Polymorphism
        Iterable<String> demoArrayList3=new ArrayList<>();//Polymorphism
        List<String> cities=new ArrayList<>();//Polymorphism

        cities.add("New York");
        cities.add("Atlanta");
        cities.add("Chicago");
        cities.add("Mclean");
        cities.add("New York");
        System.out.println(cities);
        System.out.println("first city: "+cities.get(0));
        System.out.println("Count of cities= "+cities.size());

        System.out.println(demoArrayList);





    }
}
