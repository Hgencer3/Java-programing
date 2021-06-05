package day50_inheritance;


/**
 * Sub class/ child class/Derived class
 */
public class dTeacher extends cPerson {

    int teacherID;

    public void teach(String topic){
        System.out.println("Teacher is teachimg "+topic);
    }

}
