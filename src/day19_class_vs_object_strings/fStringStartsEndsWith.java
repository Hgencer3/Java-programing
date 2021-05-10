package day19_class_vs_object_strings;

public class fStringStartsEndsWith {
    public static void main(String[] args) {
        String word="Hello World";
        System.out.println(word.startsWith("H"));
        System.out.println(word.startsWith("Hel"));
        System.out.println(word.startsWith("Hello "));
        System.out.println("Java".startsWith("Ja"));

        System.out.println(word.endsWith("ld"));
        System.out.println(word.endsWith(" World"));
        System.out.println(word.endsWith("o World"));
        System.out.println("Java".endsWith("va"));

        System.out.println(word.contains("lo"));
        System.out.println(word.contains("lo W"));
        System.out.println(word.contains("lo World"));
        System.out.println("Java".contains("av"));


        String name = "Irina";

        if (name.endsWith("a")){
            System.out.println("Maybe its a female name");
        }
        String name1="Dr. Nadir";

        if (name1.startsWith("Mr.")){
            System.out.println("Man");
        } else if (name1.startsWith("Dr.")){
            System.out.println("Doctor");
        }else if (name1.startsWith("Mrs.")){
            System.out.println("Married Woman");
        }else if (name1.startsWith("Ms.")){
            System.out.println("Single Women");
        }else if (name1.startsWith("Sr.")){
            System.out.println("Senior");
        }else{
            System.out.println("We are all human");
        }

        String url = "https://stackoverflow.edu";
        if (url.endsWith(".com")){
            System.out.println("Commersial website");
        } else if (url.endsWith(".ru")){
            System.out.println("Russian website");
        }else if (url.endsWith(".gov")){
            System.out.println("Goverment website");
        }else if (url.endsWith(".edu")){
            System.out.println("Education website");
        }else if (url.endsWith(".org")){
            System.out.println("Organization website");

        }

    }
}