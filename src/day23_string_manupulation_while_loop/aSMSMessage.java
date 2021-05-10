package day23_string_manupulation_while_loop;

public class aSMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [ saim    ] From Number<+1 (222)-333-4444> Message:{Hello, lets code some java}";

        int start = message.indexOf("[");
        int end=message.indexOf("]");
        System.out.println(message.substring(start+1, end));
        String sender=message.substring(start+1, end);
        System.out.println(sender);

        String mobile=message.substring(message.indexOf("<")+1,message.indexOf(">"));
        System.out.println(mobile);

        String text=message.substring(message.indexOf("{")+1, message.indexOf("}"));
        System.out.println(text);
        sender = sender.trim();// yanlardaki spaceleri siliyorr
        if (sender.equals("saim")){
            System.out.println("Message from saim about homework");
        }else{
            System.out.println("Someone else message");
        }

    }
}
