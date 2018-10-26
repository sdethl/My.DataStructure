package leetcode;

import datastructure.ListNode;

public class SingleLinkedListQuestions {

    /**
     * #206. Reverse Linked List
     */
    public static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        while( current != null){
            //current node's next point to somewhere else
            ListNode temp = current.next;
            //previous one becomes the next
            current.next = prev;
            //current one becomes the previous
            prev = current;
            //the original next become current
            current = temp;
        }
        return prev;
    }

    public static ListNode reverseList2(ListNode head){
        return  head;
    }

    /**
     * # 237. Delete Node in a Linked List
     *
     * The linked list will have at least two elements.
     All of the nodes' values will be unique.
     The given node will not be the tail and it will always be a valid node of the linked list.
     Do not return anything from your function.
     */
    public static void deleteNode(ListNode head){


    }


    public static void printList(ListNode node){
        while( node != null){
            //todo: fix getValue
            //System.out.print(node.getValue() + " ");
            node = node.next;
        }
    }

    public static void main(String[] args){

        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);

        printList(reverseList(list));

    }
}
