package Stacks;

public class Stack_Array {
    public static void main(String[] args) {
        ArrayImplementation<Integer> st = new ArrayImplementation<>();
        System.out.println("Capacity: "+st.capacity());
        st.push(10);
        st.display();
        st.push(20);
        st.display();
        st.push(30);
        st.display();
        st.push(40);
        st.display();
        st.push(50);
        st.display();
        st.push(60);
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.isFull());
        st.pop();
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.display();
        st.pop();
        System.out.println(st.isEmpty());

        ArrayImplementation<String> Stringstack = new ArrayImplementation<>();
        Stringstack.push("Raghav");
        Stringstack.push("Kritika");
        Stringstack.push("Naman");
        Stringstack.display();
    }
}
