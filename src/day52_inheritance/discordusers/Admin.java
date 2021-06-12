package day52_inheritance.discordusers;

public class Admin extends User {

    public Admin(){
        super();//call super class no args constuctor
        System.out.println("Admin class constuctors");
    }

    public Admin(String name, String id){
        super("Admin", name, id);
        System.out.println("Admin class 2 args contructor");
    }
   @Override
    public String toString(){
        return "Admin{" +
                "name='" + getName() + '\'' +
                ", id='" + getId()+ '\'' +
                ", role='" + getRole() + '\'' +
                '}';
    }
    }

