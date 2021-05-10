package day06_arithmetic_operators;

public class cMoreMathOperators {
    public static void main(String[] args){
        int toyotas = 431;
        int hondas = 233;
        int vw = 2;
        int tesla = 20;
        int nissan = 1;
        int bmw = 155;
        int totalCarsInParking = tesla+toyotas+vw+hondas+bmw+nissan;

        System.out.println("Total Cars In Parking: " + (toyotas+ hondas+vw+nissan+bmw+tesla));
        System.out.println("Total Cars In Parking: " + totalCarsInParking);
        System.out.println("There are "+ (toyotas+ hondas+vw+nissan+bmw+tesla) + " in the parking lot");

        String pizza = "havaiian";
        int slices = 8;
        int people = 4;
        int slicesPerPerson = slices/people;
        System.out.println("there are "+ slicesPerPerson+ " slices per person");
        System.out.println("We ordered "+ pizza+ " pizza with "+ slices + " slices "+ people+ " people ate, "
        +(slices/people)+ " slices per person");
        System.out.println("We ordered havaiian pizza with 8 slices 4 people ate, 2 slices per person");
    }
}
