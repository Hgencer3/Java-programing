package day56_abstraction.greeting;

public class Japaniese implements Greeting {
    @Override
    public void hi() {
        System.out.println("Koniciva");
    }

    @Override
    public void bye() {
        System.out.println("Sayanora");
    }
}
