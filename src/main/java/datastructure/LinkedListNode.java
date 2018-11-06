package datastructure;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class LinkedListNode {

    /**
     * Linked list data structure
     */
    static Node head;
    private static class Node{
        //data
        int value;
        //reference of next node
        Node next;
        Node(int x){
            value = x;
            next = null;
        }
    }

    public Node addFront(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        return head;
    }

    /**
     * # 237. Delete Node in a Linked List
     *
     * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
     Given linked list -- head = [4,5,1,9], which looks like following:
     4 -> 5 -> 1 -> 9
     Example 1:

     Input: head = [4,5,1,9], node = 5
     Output: [4,1,9]
     Explanation: You are given the second node with value 5, the linked list
     should become 4 -> 1 -> 9 after calling your function.
     *
     *
     * The linked list will have at least two elements.
     All of the nodes' values will be unique.
     The given node will not be the tail and it will always be a valid node of the linked list.
     Do not return anything from your function.
     *
     */
    public void deleteNode(int key){
        // Store head node
        Node temp = head, prev = null;
        // If head node itself holds the value to be deleted
        if (temp != null && temp.value == key){
            head = temp.next; // Changed head
            return;
        }
        // Search for the value to be deleted, keep track of the
        // previous node as we need to change temp.next
        while (temp != null && temp.value != key){
            prev = temp;
            temp = temp.next;
        }
        // If value was not present in linked list
        if (temp == null) return;
        // Unlink the node from linked list
        prev.next = temp.next;
    }

    /**
     * #206. Reverse Linked List
     */
    public Node reverseListIteratively(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    public void reverseListRecusively(Node head){

    }

    public boolean isEqual(Node a, Node b){
        boolean same = true;
        while( a!=null & b!=null){
            if( a.value == b.value ){
                a = a.next;
                b = b.next;
            }else{
                same = false;
                break;
            }
        }
        return same;
    }

    public void printList(){
        while( head != null){
            System.out.print(head.value + " ");
            head = head.next;
        }
    }

    public static void main(String[] args){
        LinkedListNode list = new LinkedListNode();
        list.addFront(1);
        list.addFront(5);
        list.deleteNode(1);
        list.printList();
        Queue q = new PriorityQueue();
        Deque dq = new ArrayDeque();

    }
}
