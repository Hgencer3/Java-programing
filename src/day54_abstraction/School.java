package day54_abstraction;

public class School {
    public static void main(String[] args) {
        //Student student=new Student(); Error - connat create object of Student
        OnlineStudent onlineStudent=new OnlineStudent();
        onlineStudent.attendClass();

        campusStudent campusStudent=new campusStudent();
        campusStudent.attendClass();




    }
}
