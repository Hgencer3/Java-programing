package day49_static;

public class aStaticMethods {

    int num=10;
    static int count=5;
    public static void displayMessage(String messge){
        System.out.println("message: "+messge);
        //System.out.println("num = " + num); --> ERROR numis instance variable
        System.out.println("count = " + count);
    }
    static public void anotherStaticMethod(){
        System.out.println("another static method");
        displayMessage("Hello again");
    }

    //StaticMethods.instanceMethod(); > no
    //StaticMethods stm = new StaticMethods();
    //stm.instanceMethod();
    public void instanceMethod() {
        System.out.println("instanceMethod");
        System.out.println("num = " + num);
        System.out.println("count = " + count);
        displayMessage("hello from instance method");
    }


}
