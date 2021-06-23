package day56_abstraction.driveable;

import day56_abstraction.greeting.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void autoPilot() {
        System.out.println("Flying on outo-pilot mode ");
    }

    @Override
    public void transtportPeople() {
        System.out.println("Flying people from one city to another");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane costs "+mile*250+ " to drive "+mile+" miles");
    }

    @Override
    public void hi() {
        System.out.println("Welcome");
    }

    @Override
    public void bye() {
        System.out.println("Thanks flying for us");
    }
}
