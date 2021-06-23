package day56_abstraction.greeting;

public class MountinLanguage implements Greeting{
    @Override
    public void hi() {
        System.out.println("Zeeeee");
    }

    @Override
    public void bye() {
        System.out.println("Buaaa");
    }
}
