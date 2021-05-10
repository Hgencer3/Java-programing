package day28_loops;

import java.util.Random;

public class bRamdonPasword {
    public static void main(String[] args) {

        String source="ABCDEFGHJKLMNOPQRSTUVWXYabcdefghjklmnopqrstuvwxyz0123456789_!@#$%^&*";

        Random random=new Random();
        String password="";

        for (int i=1;i<=8;i++) {
            int index=random.nextInt(71);
            //System.out.print(source.charAt(index));
            password += source.charAt(index);
            //System.out.println(random.nextInt(source.length()));
        }
        System.out.println("Your password = "+password);
    }
}
