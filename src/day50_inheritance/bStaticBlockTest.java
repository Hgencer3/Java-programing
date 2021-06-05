package day50_inheritance;

public class bStaticBlockTest {
    public static void main(String[] args) {
        aStaticBlockDemo demo=new aStaticBlockDemo();
        aStaticBlockDemo demo2=new aStaticBlockDemo();// it works once
        aStaticBlockDemo demo3=new aStaticBlockDemo();
        System.out.println(aStaticBlockDemo.num);
        aStaticBlockDemo demo4=new aStaticBlockDemo(50);
        System.out.println(aStaticBlockDemo.num);

    }
}
