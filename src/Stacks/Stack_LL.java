package Stacks;

public class Stack_LL {
    public static void main(String[] args) {
        LinkedListImplementation<Integer> st = new LinkedListImplementation<>();
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
        st.display();
        System.out.println(st.peek());
        System.out.println(st.size());
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

        LinkedListImplementation<String> Stringstack = new LinkedListImplementation<>();
        Stringstack.push("Raghav");
        Stringstack.push("Kritika");
        Stringstack.push("Naman");
        Stringstack.display();
    }
}
