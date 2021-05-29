package day48_constructors_static;

public class gEngine {
    private int cylinder;

    public gEngine(int cylinder) {
        this.cylinder = cylinder;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    @Override
    public String toString() {
        return "gEngine{" +
                "cylinder=" + cylinder +
                '}';
    }
}
