package day41_arraylist;

import java.util.ArrayList;

public class aCities {
    public static void main(String[] args) {
        //declare arraylist
        ArrayList<String> cities = new ArrayList<>();
        //add cities to arraylist -->add methods
        cities.add("Washington DC");// 0 index
        cities.add("New York");//1
        cities.add("Vienna");//2
        cities.add("Adana");//3
        cities.add("LA");//4
        //add Ashgabat to 0 index
        cities.add(0, "Ashgabat");// overloading same methoda name diffirent paramater
        //print all values in same lane
        System.out.println(cities);
        //print first and last values
        System.out.println("first city = "+cities.get(0));
        System.out.println("last city = "+cities.get(cities.size()-1));
        //print count of items in arraylist
        System.out.println("count of items= "+cities.size());

        int size=cities.size();
        System.out.println("there are "+size+"cities in the list");

        //for loop and print all values
        for (int i=0 ; i<cities.size();i++){
            System.out.println(i + "->"+cities.get(i)+" ");
        }
        //print only half of cities
        for (int i=0 ; i<cities.size()/2;i++){
            System.out.println(i + "->"+cities.get(i)+" ");
        }
        //for each loop
        for (String each: cities) {
            System.out.print(each+" ");
        }
        //delete item from arraylist with index value
        cities.remove(3);
        System.out.println();
        System.out.println(cities);
        // remove using object/value
        cities.remove("New York");
        System.out.println(cities);
        // remove every thing
        cities.clear();
        System.out.println(" after remove all = "+cities);

        if (cities.isEmpty()){
            System.out.println("list is empty");
        }
        if (cities.size()==0){
            System.out.println("list is empty");
        }

    }
}
