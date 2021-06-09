package day51_inheritance;

public class bContractor extends aEmployee {
    @Override
    //1) lets everone know that you are overriding this method
    //2)ensures that this method is neing overriding. if not shows ERROR
    public double calculateSalary(double hourly){
        return 50*40*hourly;
    }

    @Override
    public String toString() {
        return "bContractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
