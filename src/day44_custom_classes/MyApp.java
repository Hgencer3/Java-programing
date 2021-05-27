package day44_custom_classes;

public class MyApp {
    public static void main(String[] args) {
        App app=new App();
        app.name="Google Maps";
        System.out.println("version is "+ (app.version));
        app.open();
    }
}
