package queueusinglinkedlist;
import java.util.LinkedList;

public class QueueUsingLinkedList {
 public static void main(String[] args) {
 LinkedQueue lq = new LinkedQueue();
 lq.enqueue(10);
 lq.enqueue(20);
 lq.enqueue(30);
 lq.print();
 lq.dequeue();
 lq.print();
 lq.enqueue(40);
 lq.print();
 lq.dequeue();
 lq.print();
 }
}