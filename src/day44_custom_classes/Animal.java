package day44_custom_classes;

public class Animal {

    String type;

    public void eat(){
        System.out.println("The "+type+" is eating");
    }
    public void eat(String food){//  ----> created Overloaded method -->> same class diffirent param
        System.out.println("The "+type+" is eating "+food);
    }
    public void speak(){
        System.out.println("The "+type+" is speaking");
    }
}
