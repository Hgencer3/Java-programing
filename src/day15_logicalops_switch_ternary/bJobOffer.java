package day15_logicalops_switch_ternary;

public class bJobOffer {
    public static void main(String[] args) {
        String location="Atlanta";
        boolean isRemote= true;
        int salary = 100000;
        boolean benefit= true;
        if ((salary>=90000)&&isRemote&&benefit&&location.equals("Atlanta")){
            System.out.println("Accept this offer");
        }else{
            System.out.println("Reject this offer");
        }
    }
}
