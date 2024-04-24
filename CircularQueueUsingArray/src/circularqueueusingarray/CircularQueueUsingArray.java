/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circularqueueusingarray;

public class CircularQueueUsingArray {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue);
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue);
        queue.enqueue(60);
        System.out.println(queue);
        queue.enqueue(10000);
        System.out.println(queue);
        // queue.enqueue(100000);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        

    }

}
