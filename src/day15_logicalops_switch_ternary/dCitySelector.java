package day15_logicalops_switch_ternary;

public class dCitySelector {
    public static void main(String[] args) {

        String city = "Boston";

        if (city.equals("Moscow") || city.equals("Tampa")) {
            System.out.println("Willing to relocpte to Moscow" + city);
        } else {
            System.out.println("Not considering " + city);
        }

        String teacher = "Saim";

        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("its a java class with " + teacher);
        } else {
            System.out.println("soft skill class with Nadir");
        }

        teacher = "Nadir";
        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("its a java class with " + teacher);
        } else if (teacher.equals("Nadir")) {
            System.out.println("soft skill class with " + teacher);
        } else {
            System.out.println("some other class with" + teacher);
        }
        String company = "Google";
        int salary = 90_000;

        if (company.equals("Google") || salary>=100_000){
            System.out.println("accept the offer");
        }else {
            System.out.println("reject the offer");
        }

    }
}
