package day63_collections;

import java.util.Stack;

public class StackExamples {
    public static void main(String[] args) {

        Stack<String> bookStack=new Stack<>();
        bookStack.add("Harry Potter");
        bookStack.add("Leader eat last");
        bookStack.push("cucumber");
        bookStack.add("Java Intro");

        System.out.println(bookStack);
        System.out.println(bookStack.remove(0));
        bookStack.pop();//LIFO removed

        System.out.println(bookStack);
    }
}
