package leetcode;
import datastructure.ListNode;

public class Palindrome {

    /**
     * # 125. Valid Palindrome
     * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
     Note: For the purpose of this problem, we define empty string as valid palindrome.
     *
     */
    public static String longestPalindrome(String s){
        int length = s.length();
        int longest = 0;
        String result = null;
        for(int i=0; i<length-1; i++){
            for(int j= i+1; j<length+1; j++){
                //subString(start, end)
                //start is inclusive
                //but end is exclusive
                String temp = s.substring(i,j);
                if( isPalindrome(temp) && temp.length() > longest) {
                    longest = temp.length();
                    result = temp;
                }
            }
        }
        System.out.println( "longest palindrome string is: " + result);
        System.out.println(longest);
        return  result;
    }

    public static boolean isPalindromeWJDK(String s){
        //RegExp \w is used to find a word character
        //RegExp \W is used to find a non-word character
        //RegExp \s is used to find a whitespace character
        boolean b;
        String temp = s.replaceAll("\\W", " ").toLowerCase();
        if (temp == null || temp.isEmpty() || temp.trim().length() <1){
            b = true;
        }else {
            String reversed = new StringBuilder().append(temp).reverse().toString();
            if( temp.equals(reversed)){
                b = true;
            } else{
                b = false;
            }
        }
        System.out.println(b);
        return b;
    }

    public static boolean isPalindrome(String s){
        boolean b = false;
        String temp = s.replaceAll("\\W", " ").replaceAll("\\s", "").toLowerCase();
        if (temp == null || temp.isEmpty() || temp.trim().length() <= 1)
            b = true;
        else{
            char[] charlist = temp.toCharArray();
            for(int i=0,j=charlist.length-1; i<=j ; i++, j--){
                if(charlist[i] == charlist[j])
                    b = true;
                else{
                    b = false;
                    break;
                }
            }
        }
        System.out.println(b);
        return b;
    }
    /**
     * 234. Palindrome Linked List
     * Given a singly linked list, determine if it is a palindrome.
     * Follow up: Could you do it in O(n) time and O(1) space?
     */
    public static boolean isPalindromeLinkedList(ListNode node){
        ListNode original = node;
        ListNode reversed = reverse(original);
        return isEqual(original, reversed);
    }

    public static ListNode reverse(ListNode head){
        ListNode original = head;
        ListNode reversed = null;
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        reversed = prev;
        printList("original: ", original);
        printList("reversed: ", reversed);
        System.out.println(" ");
        return reversed;
    }
    public static boolean isEqual(ListNode a, ListNode b){
        printList("list a: ", a);
        printList("list b: ", b);
        while( a!=null & b!=null){
            if( a.value != b.value ){
                return false;
            }
            a = a.next;
            b = b.next;
        }
        return true;
    }
    public static void printList(String message, ListNode head){
        System.out.println(message);
        while( head != null){
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println(" ");
    }
}
