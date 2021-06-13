package day53_inheritance.final_keyword;

public class FinalRunner {
    public static void main(String[] args) {
        System.out.println(TestData.ADMIN_USERNAME);
        //TestData.ADMIN_USERNAME="Change"; Error cannot change value of final variable
        final int SSN=145526985;
        //SSN=159632552; Error cannot change value of final variable
    }
}
