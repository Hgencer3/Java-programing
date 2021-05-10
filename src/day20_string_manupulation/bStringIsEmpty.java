package day20_string_manupulation;

public class bStringIsEmpty {
    public static void main(String[] args) {
        String jobTitle="";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.length()==0);

        if (jobTitle.isEmpty()){
            System.out.println("Job Title is missing");
        }else {
            System.out.println("Job Title looks good");
        }
        if (jobTitle.length()==0){
            System.out.println("Job Title is missing");
        }else {
            System.out.println("Job Title looks good");
        }

        System.out.println(jobTitle.equals(""));
        if ("".equals(jobTitle)){
            System.out.println("Jobtitle is empty");
        }else {
            System.out.println("jobtitle looks good");
        }
        String word=" ";
        System.out.println(word.isEmpty());
        System.out.println(word.length());

        String veggie="carrots";
        System.out.println(veggie.isEmpty());

        if (!veggie.isEmpty()){
            System.out.println("we have carrots");
        }

        String word2;
        //System.out.println(word2.isEmpty());
    }
}
