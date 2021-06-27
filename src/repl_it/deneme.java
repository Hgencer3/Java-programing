package repl_it;

public class deneme {

    public static void main(String[] args) {

        System.out.println("deneme.getLast3Char(\"halil\") = " + deneme.getLast3Char("halil"));

    }
    public static String getLast3Char(String str){

        return str.substring(str.length()-3);

    }

}
