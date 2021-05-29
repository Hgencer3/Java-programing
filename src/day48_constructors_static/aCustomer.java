package day48_constructors_static;

public class aCustomer {

    private String name;
    private int id;

    public aCustomer(){
        System.out.println("New costumer name and id are in below");
    }
    public aCustomer(String name, int id){
        System.out.println("New costumer name and id are in below");
        this.name=name;//or setName(name)
        this.id=id;//or setID(id)
        System.out.println(getName()+" "+getId());
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "aCustomer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
