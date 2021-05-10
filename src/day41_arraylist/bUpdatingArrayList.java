package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class bUpdatingArrayList {
    public static void main(String[] args) {
        //car list
        List<String> myCars=new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("tesla");
        myCars.add(0,"jeep");
        myCars.add(1, "lada");
        myCars.add(2,"yugo");

        System.out.println(myCars);
        String allCarsIn1String=myCars.toString();
        System.out.println(allCarsIn1String);

        //change index 0 to Lamborghini
        myCars.set(0, "Lamborghini");
        System.out.println("after set= "+myCars.toString());//internally
        //change 4 to Honda
        myCars.set(4,"Honda");
        System.out.println("after set Honda"+myCars.toString());

        //find the index number of "ford
        System.out.println("index of ford= "+myCars.indexOf("ford"));
        int yugoIndexOf=myCars.indexOf("yugo");
        System.out.println("yugoIndexOf = "+yugoIndexOf);

        //change moskvich to jiguli using single statement
        myCars.set(myCars.indexOf("moskvich"),"jiguli");
        System.out.println(myCars.toString());

        //first find index of lada lada--> adn set value to bugatti
        if (myCars.contains("lada")){
            myCars.set(myCars.indexOf("lada"),"bugatti");
            System.out.println(myCars);
        }else {
            System.out.println("lada is not found");
        }
        /**lamborgini->prius
        jiguli->lexus
         yugo-> audi
         */
        for (int i=0; i<myCars.size();i++) {
            if (myCars.get(i).equals("Lamborghini")) {
                myCars.set(i, "prius");
            } else if (myCars.get(i).equals("jiguli")) {
                myCars.set(i, "lexus");
            } else if (myCars.get(i).equals("yugo")) {
                myCars.set(i, "audi");
            }
        }
        System.out.println(myCars.toString());
    }
}
