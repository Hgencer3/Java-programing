package day27_loops;

public class bReadStringPortion {
    public static void main(String[] args) {
        String list="cat,car,cat,red_car,java,selenium";
        /*/System.out.println(list.substring(0,3));
        System.out.println(list.substring(1,4));
        System.out.println(list.substring(2,5));

        int n=0;
        System.out.println(list.substring(n,n+3));
        n++;
        System.out.println(list.substring(n,n+3));
        n++;
        System.out.println(list.substring(n,n+3));
         */
        for (int n=0;n<list.length()-2;n++){// burda -2 azalttik cunku n
            String part=list.substring(n,n+3);
            System.out.println("part = " + part);
            if (part.equals("cat")||part.equals("car")){
                System.out.println("car or cat found");
            }
        }
    }
}
