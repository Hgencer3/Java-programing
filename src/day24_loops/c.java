package day24_loops;

public class c {
    public static void main(String[] args) {
        int count=10;
        while (count>=0){
            System.out.println(count);
            count-=2;
        }
        int unReadSMS=10;
        //read sms 1 by 1 until you have o unread
        while (unReadSMS>=1){
            System.out.println("I have totol "+unReadSMS+ " \u2709  ");
            --unReadSMS;
        }

    }
}
