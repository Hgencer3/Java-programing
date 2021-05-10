package day17_ternary_nested_conditions;

public class cAmozonPrimeShopping {
    public static void main(String[] args) {
        double itemPrice = 30.0;
        boolean isPrimeMember = false;

        if (isPrimeMember){
            System.out.println("Free 2 day shipping eligible");
        }else {
            if (itemPrice>=25.0){
                System.out.println("Eligible for free regular shipping");
            }else {
                System.out.println(" Not eligible for free shipping. Fee =$10");
            }
        }
    }
}
