package day19_class_vs_object_strings;

public class eCheckCaseMatch {
    public static void main(String[] args) {
        String countryCode="usa";
        if (countryCode.equals(countryCode.toUpperCase())){
            System.out.println("pass - case is match");
        }else {
            System.out.println("Fail - case is incorrect");
        }

    }
}
