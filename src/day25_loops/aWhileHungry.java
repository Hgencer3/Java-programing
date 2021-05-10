package day25_loops;

public class aWhileHungry {
    public static void main(String[] args) {
        boolean isHungry = true;
        int bananas = 0;
        int countThrFull=5;
        while (isHungry) {
            bananas++;
            System.out.println("Eat a banana= "+bananas);
            if (bananas==countThrFull){
              isHungry=false;
            }
        }
        System.out.println("I am not hungry");
    }
}
