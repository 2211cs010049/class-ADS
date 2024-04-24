/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queueusinglinkedlist;

import java.util.LinkedList;

class LinkedQueue {
 private final LinkedList queue = new LinkedList<>();
 public void enqueue(int item) {
 queue.addLast(item);
 }
 public int dequeue() {
 return (int) queue.removeFirst();
 }
 public void print() {
 System.out.println(queue);
 }
}