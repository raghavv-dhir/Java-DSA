package Stacks;

import java.util.Arrays;

public class ArrayImplementation<T>{
    private Object[] arr = new Object[5];
    private int idx = 0;

    public void push(T x){
        if (isFull()){
            arr = Arrays.copyOf(arr, arr.length*2);
        }
        arr[idx++] = x;
    }

    public T pop(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return null;
        }
        @SuppressWarnings("unchecked")
        T top = (T) arr[idx-1];
        arr[idx-1] = null;
        idx--;
        return top;
    }

    public T peek(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return null;
        }
        @SuppressWarnings("unchecked")
        T top = (T) arr[idx-1];
        return top;
    }

    public void display(){
        for (int i = 0; i <= idx-1; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public int size(){
        return idx;
    }
    public boolean isEmpty(){
        return idx == 0;
    }
    public boolean isFull(){
        return idx == arr.length;
    }
    public int capacity(){
        return arr.length;
    }
}
