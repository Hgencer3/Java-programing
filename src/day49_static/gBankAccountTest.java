package day49_static;

public class gBankAccountTest {
    public static void main(String[] args) {
        fMyBankAccount husband=new fMyBankAccount();
        husband.user="Halil";
        husband.spend(200);
        husband.showBalance();

        fMyBankAccount wife=new fMyBankAccount();
        wife.user="my wife";
        wife.showBalance();
        wife.spend(250);
        wife.showBalance();

        husband.showBalance();
        husband.spend(200);
        husband.showBalance();
    }
}
