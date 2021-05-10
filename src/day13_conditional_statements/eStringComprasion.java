package day13_conditional_statements;

public class eStringComprasion {
    public static void main(String[] args) {
        String city = "LA";
        if (city == "Fairfax") {
            System.out.println("It is Fairfax");
        }
        if (city.equals("Fairfax")) {
            System.out.println("It is Fairfax");
        } else {
            System.out.println("It is not Fairfax");

        }
        String weather = "sunny";
        if (weather.equals("sunny")) {
            System.out.println("it's a beautiful day in the neighborhood!");
        } else {
            System.out.println("It's not sunny today. maybe tomorrow.");
        }
    }
}
