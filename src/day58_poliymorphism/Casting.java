package day58_poliymorphism;

public class Casting {
    public static void main(String[] args) {
        //create object, variable of worker and object of Superman
        Worker worker=new Superman();
        worker.work("QA Manager");
        worker.getPaid();

        ((Father)worker).raiseKid();
        ((Superman)worker).playWithKid();

        //DownCasting from Worker to Superman
        Superman superman=(Superman) worker;
        superman.feedKid();
        superman.work("developer");

    }
}
