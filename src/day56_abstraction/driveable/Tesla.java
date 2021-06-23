package day56_abstraction.driveable;

import day56_abstraction.greeting.Greeting;

public class Tesla extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void transtportPeople() {
        System.out.println("Tesla is transporting people on the roads");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Tesla costs "+mile*10+ " to drive "+mile+" miles");
    }

    @Override
    public void autoPilot() {
        System.out.println("Tesla is driving on auto");
    }
    @Override
    public void hi() {
        System.out.println("hello hello peep peeep");
    }

    @Override
    public void bye() {
        System.out.println("bye bye charge me charge me");
    }
}
