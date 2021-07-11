package day61_exceptions.exceptions;

public class ElementaryStudent {
    private int age;
    private String name;

    public ElementaryStudent(){}

    public ElementaryStudent(int age, String name) {
           setAge(age);
           setName(name);
    }

    @Override
    public String toString() {
        return "ElementaryStudent{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<5 || age>12){
            throw new IllegalArgumentException("Age cannot be less than five and more than twelve");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name ==null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty or null.");
            }
        this.name=name;
    }

}
