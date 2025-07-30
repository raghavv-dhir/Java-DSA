package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {
    private static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    static boolean isPalindrome(ListNode head){
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while (curr != null){
            list.add(curr.val);
            curr = curr.next;
        }
        int i = 0, j = list.size()-1;
        while (i <= j){
            if (list.get(i) != list.get(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow= slow.next;
            fast = fast.next.next;
        }
        ListNode p2 = reverse(slow);
        ListNode p1 = head;
        while (p1 != null && p2 != null){
            if (p1.val != p2.val){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(1);
        a.next =b;
        b.next =c;
        c.next =d;
        System.out.println(isPalindrome(a));
        System.out.println(isPalindrome2(a));
    }
}
