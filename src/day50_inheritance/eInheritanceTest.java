package day50_inheritance;

public class eInheritanceTest {
    public static void main(String[] args) {
        cPerson p1= new cPerson();
        p1.name="Bakyt";
        p1.age=30;
        p1.talk();
        p1.walk();
        p1.working("SDET");

        dTeacher t1=new dTeacher();
        t1.teacherID=1234;
        t1.name="Saim";
        t1.age=33;
        t1.working("Teacher");
        t1.talk();
        t1.teach("Java");


        fStudent student=new fStudent();
        student.name="Halil";
        student.age=30;
        student.study("java");
        student.walk();


    }
}
