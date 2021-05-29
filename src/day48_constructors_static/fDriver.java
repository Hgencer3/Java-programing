package day48_constructors_static;

public class fDriver {
    private String name;

    public fDriver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "f{" +
                "name='" + name + '\'' +
                '}';
    }
}
