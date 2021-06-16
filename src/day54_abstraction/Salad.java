package day54_abstraction;

public class Salad extends MenuItem{

    @Override
    public void prepare() {
        System.out.println("chop veggies and dressing");
    }

    @Override
    public void serve() {
        System.out.println("Put into bowl and serve it");
    }
}
