package LinkedList;

public class displayReverse {
    //ListNode class
    private static class ListNode {
        int val;
        ListNode next;
        //constructor
        public ListNode(int x){
            val = x;
        }
    }
    public static ListNode displayReverseRecursively(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = displayReverseRecursively(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void display(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static ListNode displayReverseIteratively(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        ListNode agla = null;
        while(current != null){
            agla = current.next;
            current.next = prev;
            prev = current;
            current = agla;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        System.out.println("Recursive Reverse:");
        ListNode x = displayReverseRecursively(a);
        display(x);

        System.out.println("Iterative Reverse:");
        ListNode y = displayReverseIteratively(x);
        display(y);
    }

}
