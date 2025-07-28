package LinkedList;

public class DeleteMiddleNodeOfLinkedList {
    private static class ListNode {
        int val;
        ListNode next;

        //constructor
        public ListNode(int x){
            val = x;
        }
    }
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if(slow.next == null){ //If only 1 node is present, just return null
            return null;
        }
        while(fast.next.next != null && fast.next.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next; //skip the middle node
        return head;
    }
}
