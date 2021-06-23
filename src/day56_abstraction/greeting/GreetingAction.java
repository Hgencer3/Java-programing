package day56_abstraction.greeting;

public class GreetingAction {
    public static void main(String[] args) {
        MountinLanguage ml=new MountinLanguage();
        ml.hi();

        ml.bye();

        Greeting gt=new MountinLanguage();
        gt.hi();
        gt.bye();

        Japaniese jp=new Japaniese();
        jp.hi();
        jp.bye();

        gt=new Japaniese();
        gt.hi();
        gt.bye();
    }
}
