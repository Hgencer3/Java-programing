package day46_encapsulation;

public class dCapitalOne {
    public static void main(String[] args) {
        cCheckingAccount account=new cCheckingAccount();
        account.setAccountHolder("Halil GENCER");
        account.setAccountNumber(78945632451l);
        account.setType("Checking");
        account.setBalance(1500.55);

        System.out.println("Account Holder= "+ account.getAccountHolder());
        System.out.println("Account Number= "+ account.getAccountNumber());
        System.out.println("Account Type= "+ account.getType());
        System.out.println("Account Balance= "+ account.getBalance());



    }
}
