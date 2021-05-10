package day18_conditions_practice_strings_intro;

public class gAuthentication {
    public static void main(String[] args) {
        int expLast4SSN = 1111;
        int eptPinCode = 1234;

        int last4SSN = 111;
        int pinCode = 1134;

        if (last4SSN == expLast4SSN && pinCode == eptPinCode) {
            System.out.println("Authentication successful");
        } else {
            if (last4SSN != expLast4SSN) {
                System.out.println("SSN not correct");
            }
            if (pinCode != eptPinCode) {
                System.out.println("Pin not correct");
            }
        }
    }
}
