package LinkedList;

public class ReturnNthNodeFromEnd {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    static ListNode nthNode(ListNode head, int idx){
        ListNode temp = head;
        int size = 0;
        while (temp != null){
            size++;
            temp = temp.next;
        }
        temp = head;
        int m = size - idx + 1; //mth node from start
        for (int i = 1; i <= m-1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    static ListNode nthNodeSlowFast(ListNode head, int idx){
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 1; i <= idx; i++) {
            fast = fast.next;
        }
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        // 10 20 30 40 50
        ListNode temp = nthNode(a, 2);
        System.out.println(temp.val);

        ListNode temp2 = nthNodeSlowFast(a, 2);
        System.out.println(temp2.val);
    }
}
