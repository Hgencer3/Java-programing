package day63_collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {

        Queue<String> queue=new ArrayDeque<>();
        queue.add("one");
        queue.add("two");
        queue.add("tree");
        queue.add("four");

        System.out.println(queue.element());
        System.out.println(queue.peek());

        System.out.println(queue.poll());
        System.out.println(queue.remove());
        System.out.println(queue.poll());



    }
}
