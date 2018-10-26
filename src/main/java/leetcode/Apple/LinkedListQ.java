package leetcode.Apple;

public class LinkedListQ {

    static class ListNode{
        ListNode next;
        int val;
        ListNode(int x){
            val = x;
        }
    }

    /**
     * While you are traversing the list, change the current node's next pointer to point to its previous element.
     * Since a node does not have reference to its previous node,
     * you must store its previous element beforehand.
     * You also need another pointer to store the next node before changing the reference.
     * Do not forget to return the new head reference at the end!
     */
    public ListNode reverseList(ListNode head){

        ListNode previous = null;
        ListNode current = head;
        ListNode next;

        // O(n) O(n)
        //How to remember this? start from next then back to next
        while( current != null){
            next = current.next;
            current.next = previous; //reverse statement
            previous = current;
            current = next;
        }
        return previous;
    }

    // don't understand
    public ListNode reverseList2(ListNode head){
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    public void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
