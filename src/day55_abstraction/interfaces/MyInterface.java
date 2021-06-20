package day55_abstraction.interfaces;

public interface MyInterface {
    public abstract void learn();
}

interface MyInterface2{

}

class Myclass implements MyInterface, MyInterface2{

    @Override
    public void learn() {
        System.out.println("Learning something");
    }
}
class Main{
    public static void main(String[] args) {
        //MyInterface myInterFace = new MyInterFace(); Error cannot creater object of interface
        Myclass myclass=new Myclass();


    }
}
