package LinkedList;

public class IntersectionOfTwoLinkedLists {
    //ListNode class
    private static class ListNode {
        int val;
        ListNode next;

        //constructor
        public ListNode(int x){
            val = x;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null; // No intersection if either list is empty
        }

        ListNode tempA = headA;
        ListNode tempB = headB;

        // Calculate lengths of both linked lists
        int lengthA = 0, lengthB = 0;
        while (tempA != null) {
            lengthA++;
            tempA = tempA.next;
        }
        while (tempB != null) {
            lengthB++;
            tempB = tempB.next;
        }

        // Reset pointers to the heads of the lists
        tempA = headA;
        tempB = headB;

        // Align the starting points of both lists
        if (lengthA > lengthB) { //Whichever list is longer, initialize it first by (difference) steps to handle the different lengths and start from equality
            int steps = lengthA - lengthB;
            for (int i = 0; i < steps; i++) {
                tempA = tempA.next;
            }
        } else {
            int steps = lengthB - lengthA;
            for (int i = 0; i < steps; i++) {
                tempB = tempB.next;
            }
        }

        // Traverse both lists together to find the intersection
        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }

        // Return either the intersection node or null
        return tempA;
    }
}
