package day50_inheritance;

/**
 * super class / parent class/ base class
 */
public class cPerson {
    String name;
    int age;
    public void walk(){
        System.out.println(name+" is walking");
    }
    public void talk(){
        System.out.println(name+" is talking");
    }
    public void working(String job){
        System.out.println(name+" is working");
    }
}
