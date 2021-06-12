package day52_inheritance.discordusers;

public class User {
    private String name;
    private String id;
    private String role;

    public User(){
        System.out.println("User class contructor");
    }

    public User(String name, String id, String role) {
        System.out.println(" User class 3 args constructor ");
        this.name = name;
        this.id = id;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
