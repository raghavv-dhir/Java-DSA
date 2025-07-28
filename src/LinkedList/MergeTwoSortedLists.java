package LinkedList;

public class MergeTwoSortedLists {
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public Node mergeTwoLists(Node list1, Node list2){
        Node temp1 = list1; //pointer node to traverse list1
        Node temp2 = list2; //pointer node to traverse list2
        Node dummy = new Node(100); //dummy node
        Node temp = dummy;
        while(temp1 != null && temp2 != null){
            if(temp1.data < temp2.data){
                Node a = new Node(temp1.data); //start adding after dummy node
                temp.next = a;
                temp = a;
                temp1 = temp1.next;
            } else {
                Node a = new Node(temp2.data);
                temp.next = a;
                temp = a;
                temp2 = temp2.next;
            }
        }
        if(temp1 == null){
            temp.next = temp2; //join the remaining part of either list
        } else {
            temp.next = temp1;
        }
        return dummy.next;
    }

    public Node mergeTwoLists_inSpace(Node list1, Node list2){
        Node t1 = list1; //pointer node to traverse list1
        Node t2 = list2; //pointer node to traverse list2
        Node dummy = new Node(100); //dummy node
        Node t = dummy;
        while(t1 != null &&  t2 != null){
            if(t1.data < t2.data){
                t.next = t1;
                t = t1;
                t1 = t1.next;
            } else {
                t.next = t2;
                t = t2;
                t2 = t2.next;
            }
        }
        if(t1 == null){
            t.next = t2;
        } else {
            t.next = t1;
        }
        return dummy.next;
    }
}
