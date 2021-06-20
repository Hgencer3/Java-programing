package day55_abstraction.exercise_example;

public class AtTheGym {
    public static void main(String[] args) {
        Exercise exercise=new FreeWeight();//polymorphism benefit of abstraction
        Running running=new Running();
        Swimming swimming=new Swimming();
        Lifting lifting=new FreeWeight();//polymorphism
        FreeWeight freeWeight=new FreeWeight();

        exercise.start();
        exercise.perform();
        System.out.println("running 30 minutes: "+exercise.getCaloriesCount(30));

        running.start();
        running.perform();
        System.out.println("running 30 minutes: "+exercise.getCaloriesCount(30));

        swimming.start();
        swimming.perform();
        System.out.println("swimming 30 minutes: "+exercise.getCaloriesCount(30));

        freeWeight.start();
        freeWeight.perform();
        System.out.println("lifting free weigth 30 minutes: "+exercise.getCaloriesCount(30));

    }
}
