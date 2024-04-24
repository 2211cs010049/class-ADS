/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stackusinglinkedlist;
import java.util.*;
class LinkedStack {
 private LinkedList linklist = new LinkedList<>();
 public void push(int item) {
 linklist.addFirst(item);
 }
 int pop() {
 return (int) linklist.removeFirst();
 }
 public void printlist() {
 System.out.println(linklist);
 }
}
public class StackUsingLinkedList {
 public static void main(String[] args) {
 LinkedStack l1 = new LinkedStack();
 l1.push(10);
 l1.push(20);
 l1.push(30);
 l1.printlist();
 System.out.println(l1.pop());
 l1.printlist();
 }
}
