package Stacks;

public class LinkedListImplementation<T> {

    //Node class
    static class Node<T>{
        T data;
        Node<T> next;

        Node(T data){
            this.data = data;
            this.next = null;
        }
    }
    private Node<T> head = null;
    private int size = 0;

    public void push(T x){
        Node<T> temp = new Node<>(x);
        temp.next = head;
        head = temp;
        size++;
    }

    public T pop(){
        if (isEmpty()){
            System.out.println("Stack is Empty!");
            return null;
        }
        T x = head.data;
        head = head.next;
        size--;
        return x;
    }

    public T peek(){
        if (isEmpty()){
            System.out.println("Stack is Empty!");
            return null;
        }
        return head.data;
    }

    public void displayRec(Node<T> h){
        if (h == null) return;
        displayRec(h.next);
        System.out.print(h.data+" ");
    }

    public void display(){
        displayRec(head);
        System.out.println();
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }
}
