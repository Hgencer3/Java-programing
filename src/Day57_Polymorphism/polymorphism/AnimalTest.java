package Day57_Polymorphism.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a1=new Animal();//not polymorphism
        a1.makeNoise();

        //Polymorphism way
        Animal animal1=new Dog(); //parent type = new child type()
        Animal animal2=new Horse();
        Animal cat=new Cat();

        animal1.makeNoise();
        animal2.makeNoise();;
        cat.makeNoise();

        List<Animal> listOfDogs=new ArrayList<>();//polymorphic list of object
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());
        listOfDogs.add(new Horse());
        listOfDogs.add(new Cat());

        for (Animal each:listOfDogs){
            each.makeNoise();
        }
    }
}
