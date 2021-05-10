package day43_list_custom_classes;

public class cPerson {
    //data -> variables
    String firstName;
    int age;
    char gender;
    //behaviour
    public void speak(){
        System.out.println("Person is speaking");
    }

}
class People{
    public static void main(String[] args) {
        //create object of Person class
        cPerson person1=new cPerson();
        person1.firstName="Bob";
        person1.age=33;
        person1.gender='M';
        person1.speak();// no need to print again

        System.out.println(person1.firstName);
        System.out.println(person1.age);
        System.out.println(person1.gender);

        cPerson person2=new cPerson();
        person2.firstName="Mike";
        person2.age=32;
        person2.gender='M';
        person2.speak();

        System.out.println(person2.firstName);
        System.out.println(person2.age);
        System.out.println(person2.gender);

    }
}
