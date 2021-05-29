package day48_constructors_static;

import java.util.Arrays;
import java.util.Scanner;

public class dCyeberteksGroup {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        cGroup cybertekGroup=new cGroup("Class Chat");
        System.out.println(cybertekGroup);
        System.out.println("Please add 3 class chat member");
        cybertekGroup.addMember(scan.next());
        cybertekGroup.addMember(scan.next());
        cybertekGroup.addMember(scan.next());
        System.out.println(cybertekGroup);
        System.out.println("How many member are there: "+cybertekGroup.getMembers().size());

        cGroup cybertekGroup2=new cGroup("General Chat");
        System.out.println(cybertekGroup2);
        System.out.println("Please add 3 general chat member");
        cybertekGroup2.addMember(scan.next());
        cybertekGroup2.addMember(scan.next());
        cybertekGroup2.addMember(scan.next());
        System.out.println(cybertekGroup2);
        System.out.println("How many member are there: "+cybertekGroup2.getMembers().size());

        cGroup cybertekGroup3= new cGroup("Questions&Answers Instructors");
        System.out.println(cybertekGroup3);
        System.out.println("Please add 1 instructors");
        cybertekGroup3.setMembers(Arrays.asList(scan.next(), "Oscar"));
        System.out.println(cybertekGroup3);
        System.out.println(cybertekGroup3.getMembers());

        if (cybertekGroup3.getMembers().contains("Oscar")){
            System.out.println("Oscar is instructor of Cybertek School");
        }else{
            System.out.println("Oscar is not instructor of Cybertek School");
        }

        cybertekGroup3.removeMember("Oscar");
        System.out.println("Instructers: "+cybertekGroup3.getMembers());

    }
}
