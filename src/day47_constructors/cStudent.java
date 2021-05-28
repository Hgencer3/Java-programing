package day47_constructors;

public class cStudent {
    // no args constructor
    public cStudent(){
        System.out.println("No args constructor");
    }
    //constructor | String name param
    public cStudent(String name){
        System.out.println("name param constructor | name= "+name);
    }
    //constructor with age
    public cStudent(int age){
        System.out.println("age param constructor | age= "+age);
    }
    //constructor with name and age
    public cStudent(String name, int age){
        System.out.println("name&age param constructor | "+name + "-"+age);
    }

}
