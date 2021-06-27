package Day57_Polymorphism.abstract_class_vs_interfaces;

import java.io.Serializable;

public interface InterfaceB extends InterfaceA, Serializable, Cloneable {//interface can extend multiple other interfaces
                                                                        //interface cannot implement

}
