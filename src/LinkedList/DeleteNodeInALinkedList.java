package LinkedList;

public class DeleteNodeInALinkedList {
    static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }

        // helper to print list from this node onward
        public void printList(){
            ListNode current = this;
            while (current != null){
                System.out.print(current.val + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void deleteNode(ListNode node){
        // ⚠️ Assumption: node is not the tail!
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        // Create linked list: 4 -> 5 -> 1 -> 9
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        System.out.print("Original list: ");
        head.printList();

        // Let's say we want to delete node with value 5
        ListNode nodeToDelete = head.next; // node with value 5
        deleteNode(nodeToDelete);

        System.out.print("After deleting node 5: ");
        head.printList();
    }
}
