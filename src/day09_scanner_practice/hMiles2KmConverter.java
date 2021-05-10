package day09_scanner_practice;
import java.util.Scanner;
public class hMiles2KmConverter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter miles:");
        double miles= scan.nextDouble();
        double conventer1 = miles*1.60934;
        System.out.println(miles+" miles is "+conventer1+"km.");
        double km= scan.nextDouble();
        double converter2 = km/1.60934;
        System.out.println(km+" miles is "+ converter2+"miles.");
        }
}

