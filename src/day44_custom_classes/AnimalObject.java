package day44_custom_classes;

public class AnimalObject {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.type="Tiger";
        animal.eat("beef");
        animal.speak();
        System.out.println();

        Animal cheetahObj=new Animal();
        cheetahObj.type="Ceetah";
        cheetahObj.eat();
        cheetahObj.eat("meat");
        cheetahObj.speak();


    }
}
