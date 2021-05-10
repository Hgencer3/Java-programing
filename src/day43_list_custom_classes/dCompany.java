package day43_list_custom_classes;

public class dCompany {
    public static void main(String[] args) {
        dEmployee employee1 = new dEmployee();
        employee1.name = "Murodil";
        employee1.jobTitle = "Java Instructor";
        System.out.println(employee1.name);
        System.out.println(employee1.jobTitle);
        employee1.work();

        dEmployee employee2 = new dEmployee();
        employee2.name = "Nadir";
        employee2.jobTitle = "Soft Skill Instructor";
        System.out.println(employee2.name);
        System.out.println(employee2.jobTitle);
        employee2.work();

        dEmployee employee3 = new dEmployee();
        employee3.name = "Saim";
        employee3.jobTitle = "Java Instructor";
        System.out.println(employee3.name);
        System.out.println(employee3.jobTitle);
        employee3.work();
    }
}
