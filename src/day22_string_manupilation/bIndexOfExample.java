package day22_string_manupilation;

public class bIndexOfExample {
    public static void main(String[] args) {
        String tecnologies="java, html, css, selenium, testng, maven, cucumber";
        System.out.println(tecnologies.indexOf(","));
        System.out.println(tecnologies.lastIndexOf(","));
        int indexOfJava= tecnologies.indexOf("java");
        System.out.println("java is at index "+indexOfJava);
        int indexOfCss=tecnologies.indexOf("css");
        System.out.println("css is at index "+indexOfCss);
        int indeOfCucumber=tecnologies.indexOf("cucumber");
        System.out.println(indeOfCucumber);
        int indexOfSQL=tecnologies.indexOf("SQL");
        System.out.println(indexOfSQL);

        //technologies contains "maven" ?
        if (tecnologies.contains("maven")){
            System.out.println("maven is present");
        }else{
            System.out.println("maven isnt present");
        }
        if (tecnologies.indexOf("maven")>-1){  //>-1 or >=0
            System.out.println("maven is present");
        }else{
            System.out.println("maven isnt present");
        }
    }
}
