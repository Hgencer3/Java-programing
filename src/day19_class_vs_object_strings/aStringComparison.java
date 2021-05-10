package day19_class_vs_object_strings;

public class aStringComparison {
    public static void main(String[] args) {

        //Equals() method ----> Case Sensitive
        String city ="Baku";
        System.out.println(city.equals("Baku"));
        System.out.println(city.equals("baku"));

        //EquelsIgnoreCase() method ---> Case Insensitive

        System.out.println(city.equalsIgnoreCase("Baku"));
        System.out.println(city.equalsIgnoreCase("baku"));
        System.out.println(city.equalsIgnoreCase("BAKU"));
        System.out.println(city.equalsIgnoreCase("Baaku"));


        if (city.equals("BaKu")){
            System.out.println("equals() true");
        }else{
            System.out.println("equals() false");
        }
        if (city.equalsIgnoreCase("Baku")){
            System.out.println("equalsIgnoreCase() true");
        }else {
            System.out.println("equalsIgnoreCase() false");
        }
    }
}
