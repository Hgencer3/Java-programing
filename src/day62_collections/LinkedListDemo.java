package day62_collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> friends=new LinkedList<>();
        List<String> demoLinkedList2=new LinkedList<>();//Polymorphism
        demoLinkedList2.add("java");
        demoLinkedList2.add("is");
        demoLinkedList2.add("fun");
        demoLinkedList2.add("is");
        System.out.println(friends);
        System.out.println(demoLinkedList2);
        System.out.println(demoLinkedList2.get(0));
        System.out.println(demoLinkedList2.size());

        friends.add("Mahliya");
        friends.add("Abbas");
        friends.add("Nevzat");
        System.out.println(friends);
        System.out.println(friends.get(0));
        System.out.println(friends.size());
        friends.addFirst("Halil");
        System.out.println(friends);
        friends.add(1,"Ege");
        System.out.println(friends);





    }
}
