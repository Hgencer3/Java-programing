package day57_Polymorphism.polymorphism;

public class Cat extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Cat saying <meow>");
    }
}
