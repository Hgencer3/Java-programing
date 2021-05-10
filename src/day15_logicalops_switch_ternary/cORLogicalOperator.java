package day15_logicalops_switch_ternary;

public class cORLogicalOperator {
    public static void main(String[] args) {
        System.out.println("true  || true  = "+(true||true));
        System.out.println("true  || false = "+(true||false));
        System.out.println("false || true  = "+(false||true));
        System.out.println("false || false = "+(false||false));

        int apples = 5;
        int orenges = 7;

        if (apples>3||orenges>4){
            System.out.println("no need to buy fruit");
        }else {
            System.out.println("get some fruit");
        }
        System.out.println(apples>2||orenges>10);
        System.out.println(apples>2&&orenges>10);

        if (apples>2||orenges>10){
            System.out.println("looks like we are ood with fruit");
        }else {
            System.out.println("need to buy fruit");
        }
    }
}
