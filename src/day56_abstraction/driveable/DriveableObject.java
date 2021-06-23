package day56_abstraction.driveable;

public class DriveableObject {
    public static void main(String[] args) {
        Tesla model3=new Tesla();
        model3.hi();
        model3.start();
        model3.transtportPeople();
        model3.autoPilot();
        model3.cost(25);
        model3.stop();
        model3.bye();

        Plane plane=new Plane();
        plane.hi();
        plane.start();
        plane.transtportPeople();
        plane.autoPilot();
        plane.cost(250);
        plane.stop();
        plane.bye();

        //Polymorphism
        SelfDrivable sd=new Plane();
        SelfDrivable sd2=new Tesla();
    }
}
