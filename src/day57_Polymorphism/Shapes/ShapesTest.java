package day57_Polymorphism.Shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {
    public static void main(String[] args) {
        Shapes triangle = new Triangle();
        triangle.draw();

        Shapes circle = new Circle();
        circle.draw();

        Shapes square = new Square();
        square.draw();

        List<Shapes> listOfShapes = new ArrayList<>();
        listOfShapes.add(new Triangle());
        listOfShapes.add(circle);
        listOfShapes.add(triangle);
        listOfShapes.add(new Circle());
        listOfShapes.add(triangle);
        listOfShapes.add(new Square());
        listOfShapes.add(new Circle());
        listOfShapes.add(square);
        listOfShapes.add(circle);
        listOfShapes.add(square);


        for (Shapes each : listOfShapes) {
            each.draw();
        }
        drawShapes(new Circle());
        drawShapes(new Square());
        drawShapes(triangle);
    }

    /**
     * static method: drawShape
     * accept object of shapes
     * then calls draw() methods
     */
    public static void drawShapes(Shapes shape) {
        System.out.println("----drawing shapes----");
        shape.draw();

    }

//    public static void drawShapes(Square shape) {
//        System.out.println("----drawing shapes----");
//        shape.draw();
//
//    }
//    public static void drawShapes(Triangle shape) {
//        System.out.println("----drawing shapes----");
//        shape.draw();
//
//    }
}
