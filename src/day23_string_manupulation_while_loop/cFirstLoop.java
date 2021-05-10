package day23_string_manupulation_while_loop;

public class cFirstLoop {
    public static void main(String[] args) {
        int i=1;
        if (i<=5){
            System.out.println(1);
        }
        while (i<=5){
            System.out.println(i);
            i++;
        }
        int apples=0;
        if (apples<=10){
            System.out.println("apples = " + apples);
        }
        while (apples<=3){
            System.out.println("apples = " + apples);
            apples++;
        }
        System.out.println("apples = " + apples);
        System.out.println(i);

        if (true){
            System.out.println("hello word");
        }
        while (true){
            System.out.println("hello word");
            break;
        }
    }
}
