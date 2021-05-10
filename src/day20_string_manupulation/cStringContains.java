package day20_string_manupulation;

public class cStringContains {
    public static void main(String[] args) {
        String word= "java";
        System.out.println(word.contains("v"));
        System.out.println(word.contains("va"));
        System.out.println(word.contains("jv"));

        String company="Capital one";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("ONE"));//false-case sensitive
        System.out.println(company.contains("j"));

        if (company.contains(" ")){
            System.out.println("multiple words company name");
        }else{
            System.out.println("single word company name");
        }

        String estyTitle="Wooden spoon | Etsy";
        if (estyTitle.contains(" | ")){
            System.out.println("pass - title check passed");
        }else {
            System.out.println("fail - title check failed");
        }

        String firstName="ahmed";
        if (firstName.contains("a")&&firstName.contains("e")){
            System.out.println("your name is contains both a and e");
        }else {
            System.out.println("a || e not present");
        }

        firstName="Nadir";
        if (firstName.contains("a")||firstName.contains("i")){
            System.out.println("a or i is present");
        }else {
            System.out.println("nor a or i is present");
        }

        String email="murodil@cybertekschool.com";
        if (email.contains("@")&&email.endsWith(".com)")){
            System.out.println("its email");
        }else {
            System.out.println("its not email");
        }
        if (email.toLowerCase().contains("d")){
            System.out.println("d is present");
        }else {
            System.out.println("d is not present");
        }

    }
}
