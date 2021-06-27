package Day57_Polymorphism.abstract_class_vs_interfaces;

public interface InterfaceA  {

    abstract public void absMethodFromInterfaceClass(int num);

    /*
    before java 8(jdk 1.8) interface can have static and default methods
     */
    public static void staticMethodFromInterfaceClass(String str){
        System.out.println("static method from interface calss "+str);
    }

    public default void defaultMethodFromInterfaceClass(){
        System.out.println("default method is called");
    }


    public static final String TYPE="interfaces";
    double MAX_COUNT= 500;//this also public static final
    //private int num; --> interface class ca nnot have private (only public static final)

   // public InterfaceA(){} --> interface class cant have constructor


}
