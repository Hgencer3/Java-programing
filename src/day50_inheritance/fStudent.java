package day50_inheritance;

public class fStudent extends cPerson{

    String school;

    public void study(String topic){
        System.out.println(name+" Student is doing homework for class of "+topic);
    }
}
