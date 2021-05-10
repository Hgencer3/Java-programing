package day15_logicalops_switch_ternary;

public class aAndOperatorPractice {
    public static void main(String[] args) {

        boolean onSale = true;
        boolean freeShiping= true;
        String itemName="Wooden Spoon";

        if(onSale &&freeShiping){
            System.out.println("add chart item");
        }else{
            System.out.println("continue shopping");
        }

        if (onSale &&freeShiping&&itemName.equals("Wooden spoon")){
            System.out.println("add chart");
        }else{
            System.out.println("continue shopping");
        }



    }
}
