package day53_inheritance;

public class CarObjects {
    public static void main(String[] args) {
        ElectricCar ec1=new ElectricCar("Tesla", "Model Y",48190.0,2021,326);

        ec1.drive(50);
        System.out.println(ec1.toString());
        //System.out.println(ec1.make);
        //System.out.println(ElectricCar.make);
        System.out.println("ec1.getMake() = " + ec1.getMake());
        System.out.println("ec1.getModel() = " + ec1.getModel());
        System.out.println("ec1.getPrice() = " + ec1.getPrice());
        System.out.println("ec1.getYear() = " + ec1.getYear());
        System.out.println("ec1.getRange() = " + ec1.getRange());

        if (ec1.getPrice()>10000){
            System.out.println(ec1.getMake() +" "+ ec1.getModel()+" is out of my budget");
        }else{
            System.out.println("Purchising "+ec1.toString());
        }
        System.out.println(ElectricCar.getCount());

        ElectricCar ec2=new ElectricCar("Tesla","Cybertruck",59990.0,2022,300);
        System.out.println(ec2.toString());
        System.out.println("Count= "+ec2.getCount());//call static method using object
        System.out.println("Count= "+ElectricCar.getCount());// call static method using Classname

        Roadster roadster=new Roadster("Roadster",200000,2022,620);
        System.out.println(roadster.toString());
        roadster.drive(1000);
        roadster.drive(600);
        System.out.println(roadster.getCount());

        ModelX modelX=new ModelX("Tesla","Modelx",104000.0,2021,360);
        System.out.println(modelX.toString());
        modelX.drive(300);
        System.out.println(modelX.getCount());

    }
}
