package day48_constructors_static;

public class hBusObject {
    public static void main(String[] args) {
        eBus bus=new eBus();
        bus.driver=new fDriver("Halil");
        bus.engine=new gEngine(8);
        System.out.println("Driver name is "+bus);

        eBus metroBus=new eBus();
        metroBus.engine=new gEngine(15);
        metroBus.driver=new fDriver("Aziz");
        System.out.println("Driver name is "+ metroBus);
        System.out.println("Driver name is "+ metroBus.driver.getName());

    }
}
