package day14_multi_branch_if_statement;

public class hLocagicalANDOperator {
    public static void main(String[] args) {
        System.out.println(true&&true);
        System.out.println(false&&true);
        System.out.println(true&&false);
        System.out.println(false&&false);

        System.out.println(10>5&&1==1);
        System.out.println(99<100&&22>25);
        System.out.println(3<2&&5>2);
        System.out.println(10<5&&1>2);
        
        int apples= 10, orenges = 5;
        boolean check = apples>5 && orenges >3;
        System.out.println("check = " + check);

        if (apples > 6 && orenges > 2){
            System.out.println("I have enough apples and orenges");
        }else {
            System.out.println(" I need to go to buy Walmart to buy some fruit");
        }
    }
}
