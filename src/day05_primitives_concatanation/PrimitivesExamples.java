package day05_primitives_concatanation;

public class PrimitivesExamples {
    public static void main(String[] args){
        /* byte > short > int > long
           float > double
           char
           boolean
         */
        byte byteValue = 10;
        short shortValue = 32000;
        int intValue = 33000;
        long longValue = 33000000;
        long longValue2 = 3300000000l;//cok uzun yazacaksak sonuna l koymamiz gerekir.
        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(longValue2);
        float floatValue = 3.99f;
        double doubleValue = 333.1236547;// 333.999d also valid
        System.out.println();
        System.out.println(floatValue);
        System.out.println(doubleValue);
        char charValue = 33 ;
        boolean booleanValue= true;
        System.out.println();
        System.out.println(charValue);
        System.out.println(booleanValue);
    }
}
