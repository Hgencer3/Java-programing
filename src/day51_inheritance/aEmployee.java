package day51_inheritance;

public class aEmployee extends Object{

    String jobTitle;

    public double calculateSalary(double hourly){
        double annualSalary= 52*40*hourly*1.1;
        return annualSalary;
    }

    @Override
    public String toString() {
        return "aEmployee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
