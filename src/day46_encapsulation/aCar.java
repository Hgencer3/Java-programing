package day46_encapsulation;

public class aCar {

    private String model;
    private int year;
    private double mileage;


    public void setModel(String model){
       this.model=model;
    }
    public String getModel(){
        return model;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }
    public void setMileage(double mileage){
        this.mileage=mileage;
    }
    public double getMileage(){
        return mileage;
    }

    @Override
    public String toString() {
        return "aCar{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
