package day35_methods_with_parameters;

import java.util.Locale;

public class eEmail {
    public static void main(String[] args) {
        buildEmail("Yoksuladam","cybertek");
    }
    public static void buildEmail(String emailName, String domain){
        System.out.println((emailName.replace(" ","")).toLowerCase()+"@"+domain+".com");
    }
}
