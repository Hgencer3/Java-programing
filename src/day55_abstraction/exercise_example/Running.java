package day55_abstraction.exercise_example;

public class Running extends Exercise {
    @Override
    public void perform() {
        System.out.println("Performing running exercise");
    }

    /**
     *
     * @param minutes- how long is exercise is performed
     * @return
     */
    @Override
    public int getCaloriesCount(int minutes) {
        return minutes*13;
    }
}
