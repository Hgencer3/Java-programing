package Day57_Polymorphism.abstract_class_vs_interfaces;

public abstract class AbstractA { //Abstract class can have non abstract, abstract and static method


        public void nonAbstractMethod(){
        System.out.println("non abstract nethod");
    }
    abstract public void absMethodA();//abstract method allow only public access modifier, dont allow private static or final

    public static void staticMethod(){
        System.out.println("static method is called");
    }

    //abstract class can have instance variables, static variables with all access modifier
    int num=1;
    private double num2=3.3;
    public static int count;
    public final String TYPE="abstract";
    public static final String LANGUAGE="java";


    public AbstractA(){//abstract class can have contructor
        System.out.println("AbstractA constructor");
    }


}
