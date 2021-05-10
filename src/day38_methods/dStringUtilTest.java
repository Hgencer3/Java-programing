package day38_methods;

import static day38_methods.cStringUtils.*;

public class dStringUtilTest {
    public static void main(String[] args) {
        String userName="";
        if (cStringUtils.isNullOrEmpty(userName)){
            System.out.println("Fail: Username connat be null or emty");
        }
        System.out.println("isPalindrome(civic)= "+cStringUtils.isPalindrome("civic"));
        System.out.println("isPalindrome(kayak)= "+cStringUtils.isPalindrome("kayak"));
        System.out.println("isPalindrome(Cybertek)= "+isPalindrome("Cybertek"));
        System.out.println("Reverse java is= "+cStringUtils.reverse("java"));
    }
}
