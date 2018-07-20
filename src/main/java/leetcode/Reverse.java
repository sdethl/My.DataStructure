package leetcode;

import datastructure.ListNode;

public class Reverse {
    /**
     * Leet code : #344. Reverse String
     * Write a function that takes a string as input and returns the string reversed.
     *
     * The point:
     * 1. start from (length -1)
     * 2. char array and string conversion
     */
    public static String reverStringToList(String input){
        char[] chars = input.toCharArray();
        int len = chars.length;
        char[] reversed = new char[chars.length];
        for(int i= len-1; i>=0; i--){
            reversed[len-1-i] = chars[i];
        }
        return new String(reversed);
    }

    /**
     *  Leet code #206. Reverse Linked List
     *
     *  Reverse a singly linked list.
     *  Example:
     *  Input: 1->2->3->4->5->NULL
     *  Output: 5->4->3->2->1->NULL
     */
    public ListNode reverseList(ListNode head){
        return head;
        //todo
    }


    public static void main(String[] args){
        System.out.println(reverStringToList("good"));
    }
}
