package dll;
import java.io.*; 
class node { 
	node prev; 
	int data; 
	node next; 
	node(int value) { 
		prev = null; 
		data = value; 
		next = null; 
        } 
} 
class DLL{ 
	static node head = null; 
	static node tail = null; 
	static void insertAtBeginning(int data) { 
		node temp = new node(data); 
		if (head == null) { 
			head = temp; 
			tail = temp; 
		} 
		else { 
			temp.next = head; 
			head.prev = temp; 
			head = temp; 
		} 
	} 
	static void insertAtEnd(int data) { 
		node temp = new node(data); 
		if (tail == null) { 
			head = temp; 
			tail = temp; } 
		else { 
			tail.next = temp; 
			temp.prev = tail; 
			tail = temp; 
		} 
	} 
	static void insertAtPosition(int data, int position) { 
		node temp = new node(data); 
		if (position == 1) { 
			insertAtBeginning(data); } 
		else { 
			node current = head; 
			int currPosition = 1; 
			while (current != null
				&& currPosition < position) { 
				current = current.next; 
				currPosition++; } 
			if (current == null) { 
				insertAtEnd(data); } 
			else { 
				temp.next = current; 
				temp.prev = current.prev; 
				current.prev.next = temp; 
				current.prev = temp; 
			} 
		} 
        } 
	 
	static void display(node head) { 
		node temp = head; 
		while (temp != null) { 
			System.out.print(temp.data + " --> "); 
			temp = temp.next; } 
		System.out.println("NULL"); } 
	public static void main(String[] args) { 
		insertAtEnd(1); 
		insertAtEnd(2); 
		insertAtEnd(3); 
		insertAtEnd(4); 
		insertAtEnd(5); 
		System.out.print("After insertion at tail: "); 
		display(head); 
		System.out.print("After insertion at head: "); 
		insertAtBeginning(0); 
		display(head); 
		insertAtPosition(6, 2); 
		System.out.print( "After insertion at 2nd position: "); 
		display(head); 
		
	} 
}
