package day57_Polymorphism.polymorphism;

public class Dog extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Dog saying barn");
    }
}
