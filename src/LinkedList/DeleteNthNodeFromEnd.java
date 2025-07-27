package LinkedList;

public class DeleteNthNodeFromEnd {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    static void display(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static ListNode deleteNth(ListNode head, int n){
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        if (fast == null){
            head = head.next;
            return head;
        }
        while(fast.next != null){
            slow= slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);
        ListNode f = new ListNode(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
        a = deleteNth(a,6);
        display(a);
    }
}
