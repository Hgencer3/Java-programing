package day06_arithmetic_operators;

public class aCarDriverInfo {
    public static void main(String[] args){
        String carModel = "Toyota Corolla";
        Boolean automatic = true;
        String  driverName = "Murat";
        String licenseNumber = "16616616";
        int speed = 60;
        char licenseClass = 'D';

        System.out.println("Car Model: "+ carModel+"\n" +"Driver Name:" + driverName);
        System.out.println("Driver Name:\t"+ driverName);
        System.out.println("License Number:"+ licenseNumber+"\n"+"Speed:"+speed);
        System.out.println("Speed:"+ speed);
        System.out.println("Car Is Automatic:"+ automatic);
        System.out.println("License Class:"+ licenseClass);
        System.out.println();
        System.out.println(driverName + " is driving " + carModel);
        System.out.println("Car Speed: "+ speed + "mph");
        System.out.println( licenseClass +" " + automatic);

    }
}
