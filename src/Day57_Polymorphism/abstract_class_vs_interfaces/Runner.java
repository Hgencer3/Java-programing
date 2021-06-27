package Day57_Polymorphism.abstract_class_vs_interfaces;

public class Runner {
    public static void main(String[] args) {
        //AbstractA absA=new AbstractA(); we cannot create object (instantiate)
        // InterfaceA iA=new InterfaceA();   neither of  them

        InterfaceA.staticMethodFromInterfaceClass("wooden spoon");//statcic method no need to create object
    }
}
