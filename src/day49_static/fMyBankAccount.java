package day49_static;

public class fMyBankAccount {
    static double balance=500;
    String user;

    public void spend(double amount){
        System.out.println(user+" is spending $"+amount);
        balance-=amount;
    }
    public void showBalance(){
        System.out.println("balance: "+balance);
    }
}
