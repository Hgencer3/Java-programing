package day50_inheritance.overriding_examples;

import day50_inheritance.overriding_examples.Animal;

public class Cat extends Animal {

    public void jump(){
        System.out.println(name+" is jumping");
    }
    @Override
    public void speak(){
        System.out.println("Cat is saying Meow...");
    }
}
