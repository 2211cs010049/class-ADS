package linkedlist2;
import java.util.*;  
public class LinkedList2{  
 public static void main(String args[]){  
 LinkedList<String> ll=new LinkedList<String>();  
           System.out.println("Initial list of elements: "+ll);  
           ll.add("Anjali");  
           ll.add("Leena");  
           ll.add("Ashwini");  
           System.out.println("After invoking add method: "+ll);   
           LinkedList<String> ll2=new LinkedList<String>();  
           ll2.add("Srujana");  
           ll2.add("Aparna");  
           ll.addAll(ll2);  
           System.out.println("After invoking  method: "+ll);  
           System.out.println("After invoking addAll method: "+ll); 
           ll.addFirst("Vineeth");  
           System.out.println("After invoking addFirst method: "+ll);   
           ll.addLast("Bharath");  
           System.out.println("After invoking addLast method: "+ll);   
           ll.remove("Bharath");
           System.out.println("After removing an element: "+ll);
           ll.removeFirst(); 
           System.out.println("After removing first element: "+ll);
           ll.removeLast(); 
           System.out.println("After removing last element: "+ll);
 }  
}  
     