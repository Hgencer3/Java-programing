package day15_logicalops_switch_ternary;

public class gNotKogicalOperator {
    public static void main(String[] args) {
        System.out.println("! true = "+(!true));
        System.out.println("!false = "+ (!false));

        int age = 2;

        if(!(age>7)){
            System.out.println("Need to sit in child car seat");
        }

        boolean isSmokingAllowed= false;

        if(!(isSmokingAllowed)){
            System.out.println("Smokink is not allowed here");
        }

        boolean isAffordable = true;
        if (!(isAffordable)){
        }else {
            System.out.println("item not affordable");
        }

        String env="qa";
        if (!env.equals("qa")){
            System.out.println("In wrong envirement for QA Testing");
        }

        String car = "Tesla";
        if (!car.equals("Honda")){
            System.out.println("Not interested ");
        }

        String secret="abc123";
        String input="abc321";
        if (!(input==secret)){
            System.out.println("Incorrect Password");
        }
        if (!input.equals(secret)){
            System.out.println("Incorrect password");
        }else{
            System.out.println("Correct password");
        }


    }
}
