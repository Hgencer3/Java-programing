package day48_static;

public class bStaticTest {

    String word="java";
    static String word2="JAVA";

    public static void main(String[] args) {

        //rule 1)static method can be called using classname
        aStaticMethods.displayMessage("Wooden spoon");
        //rule 1)instance method needs an objecdt to be called
        //aStaticMethods.instanceMethod();
        aStaticMethods stm= new aStaticMethods();
        stm.instanceMethod();

        //rule 2) static method only can access other static variable and methods
        // System.out.println(word); compile error--> word is not static variable
        System.out.println(word2);



    }
}
