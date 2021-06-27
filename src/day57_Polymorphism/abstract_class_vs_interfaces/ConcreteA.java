package day57_Polymorphism.abstract_class_vs_interfaces;

public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB{ // class can extend ONE Abstract class
                                                                            // class can implement multiple interfaces
                                                                            // concrete means first non-abstract class is child of abstract or interfaces or both.


    @Override
    public void absMethodA(){
        System.out.println("absMethodA imolementation is called");
    }

    @Override
    public void nonAbstractMethod(){
        System.out.println("non abstract method overridden version is called");
    }

    //@Override --> static methods are hidden
    public static void staticMethod(){
        System.out.println("staticMethod hidden version is called");
    }
    @Override
    public void absMethodFromInterfaceClass(int num){
        System.out.println("absMethodFromInterfaceClas overridden version is called "+num);
    }


}
