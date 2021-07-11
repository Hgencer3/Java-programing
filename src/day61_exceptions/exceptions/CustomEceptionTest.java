package day61_exceptions.exceptions;

public class CustomEceptionTest {
    public static void main(String[] args) {
        double balance = 400;
        double itemPrice = 500;

        if (itemPrice > balance) {
            throw new InsufficientBalanceException("Transaction declined. Not enough funds");

        }
        System.out.println("Item successfully purchased");

    }
}
