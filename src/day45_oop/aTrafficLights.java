package day45_oop;

public class aTrafficLights {
    String colar;

    public void showColor(){
        System.out.println("current color = "+colar);
    }
    public void changedColor(String newColor){
        System.out.println("changes color to "+newColor);
        colar = newColor;
    }

}
