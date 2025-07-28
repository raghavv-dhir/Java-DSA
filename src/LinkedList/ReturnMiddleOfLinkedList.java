package LinkedList;

public class ReturnMiddleOfLinkedList {
    private static class ListNode {
        int val;
        ListNode next;

        //constructor
        public ListNode(int x){
            val = x;
        }
    }

    static ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        ListNode ans = middleNode(a);
        System.out.println(ans.val);
    }
}
