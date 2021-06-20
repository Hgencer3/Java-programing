package day55_abstraction.flags;

import java.awt.*;
import java.util.Random;

public class TurkishFlag extends Flag {
    @Override
    public void draw() {
        Grid grid = new Grid();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            grid.setColor(i,50, Color.blue);
//            grid.setColor(10,30,Color.red);
//            grid.setColor(30,50,Color.green);
        }
    }
}



