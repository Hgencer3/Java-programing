package day45_oop;

public class dMainPageCoffee {
    public static void main(String[] args) {
        cCoffee myCoffee=new cCoffee();

        System.out.println("coffee amount "+myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("coffee amount after refill "+myCoffee.getAmount());
        myCoffee.drink(50);
        System.out.println("coffee amount after drink "+myCoffee.getAmount());

        myCoffee.setType("Turkish coffee");
        System.out.println(" My coffee = "+myCoffee.getType());
        //describe myCoffee-> show all variable values
        System.out.println(myCoffee.toString());

        cCoffee coffee1=new cCoffee();
        coffee1.setType("Cappuccino");
        System.out.println("coffee1 type= "+ coffee1.getType());
        //hey java, point coffee2 to same object as coffee1
        cCoffee coffee2 =coffee1;
        System.out.println("coffee2 type= "+ coffee2.getType());
        coffee2.setType("Espresso");

        cCoffee coffee3=new cCoffee();
        coffee3.setType("Frappcino");

        coffee3=coffee2;
        System.out.println("coffee3 type= "+ coffee3.getType());



    }
}
