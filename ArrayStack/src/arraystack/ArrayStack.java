/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraystack;
import java.util.EmptyStackException;

public class ArrayStack<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private E[] array;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        array = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @SuppressWarnings("unchecked")
    public ArrayStack(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Initial capacity must be positive");
        }
        array = (E[]) new Object[initialCapacity];
        size = 0;
    }

    public void push(E element) {
        if (size == array.length) {
            resize();
        }
        array[size++] = element;
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E element = array[--size];
        array[size] = null; // Helps garbage collection
        return element;
    }

    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return array[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        int newCapacity = array.length * 2;
        E[] newArray = (E[]) new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();

        stack.push(5);
        stack.push(10);
        stack.push(15);

        System.out.println("Size of the stack: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        System.out.println("Popping elements:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}


