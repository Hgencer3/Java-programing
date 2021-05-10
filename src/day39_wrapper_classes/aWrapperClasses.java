package day39_wrapper_classes;

public class aWrapperClasses {
    public static void main(String[] args) {
        int num=10;
        num+=10;
        Integer n=new Integer(500);
        System.out.println(" is n 500= "+n.equals(500));
        System.out.println(n+300);

        Integer n2=1000;
        System.out.println(n2/500);
        //convert to String
        String numStr=n2+"";
        String numStr2=n2.toString();

        Byte b1=new Byte((byte) 5);
        Byte b2=10;
        Short sh1=new Short((short) 5);
        Short sh2=50;
        Integer i1=new Integer(5);
        Integer i2= 200;
        Long l1=new Long(300l);
        Long l2= 3455l;
        Float f1=new Float(5.2f);
        Float f2=5.2f;
        Double d1= new Double(345.2);
        Double d2=234.5;

        Character ch1=new Character('A');
        Character ch2='A';

        Boolean bl1=new Boolean(true);
        Boolean bl2=false;



    }
}
