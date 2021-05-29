package day48_constructors_static.static_exmp;

public class bCalculaterTest {
    public static void main(String[] args) {
        aCalculater.add(3,5);

        aCalculater calcObject=new aCalculater();
        calcObject.multply(2,4);
        //static method can olso be called using an object
        calcObject.add(10,45);
    }
}
