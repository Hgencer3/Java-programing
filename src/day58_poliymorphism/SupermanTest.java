package day58_poliymorphism;

public class SupermanTest {
    public static void main(String[] args) {
        Father spMan1=new Superman();
        spMan1.feedKid();
        spMan1.playWithKid();
        spMan1.raiseKid();
        //spMan1.work("SDET"); error-->spMan1 is Father type only access can only methods in father

        System.out.println();
        Worker sdet=new Superman();
        System.out.println("sdet.getPaid() = " + sdet.getPaid()+"$");
        sdet.work("sdet");
        //sdet.feedKid();error--> sdet is Worker type only access can only methods in worker

        System.out.println();
        Superman superman=new Superman();
        System.out.println("superman.getPaid() = " + superman.getPaid());
        superman.work("SDET");
        superman.raiseKid();
        superman.feedKid();
        superman.playWithKid();
        superman.equals("");//-->this method come from Object Class


    }
}
