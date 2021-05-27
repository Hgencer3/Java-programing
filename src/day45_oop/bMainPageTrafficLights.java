package day45_oop;

public class bMainPageTrafficLights {
    public static void main(String[] args) throws InterruptedException {
        aTrafficLights light= new aTrafficLights();

        light.changedColor("Red");
        Thread.sleep(2000);
        light.showColor();

        light.changedColor("Green");
        Thread.sleep(2000);
        light.showColor();

        aTrafficLights light2 = new aTrafficLights();

        light2.changedColor("Yellow");

    }
}
