package leetcode;

import datastructure.ListNode;
import org.junit.Test;

public class testPalindrome {

    @Test
    public void testCase_1(){
        assert Palindrome.isPalindrome("aba") == true;
        assert Palindrome.isPalindrome("aa") == true;
        assert Palindrome.isPalindrome("a") == true;
        assert Palindrome.isPalindrome("abba") == true;
        assert Palindrome.isPalindrome(" ") == true;
        assert Palindrome.isPalindrome("geek4keeg") == true;
        assert Palindrome.isPalindrome("cccccccccccccccccccc") == true;
        assert Palindrome.isPalindrome("aaaaaaaaaabbbbbbbbbaaaaaaaaaa") == true;
        assert Palindrome.isPalindrome("g....  eek4,';kee/.,g") == true;

        assert Palindrome.isPalindrome("geek4keega") == false;
        assert Palindrome.isPalindrome("ab#$#$%&") == false;
        assert Palindrome.isPalindrome("ab#$#$%&ab") == false;
    }

    @Test
    public void testCase_2(){
        Palindrome.longestPalindrome("aba");
    }

    @Test
    public void testCase_3(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        Palindrome.printList("the input list: ", head);
        System.out.println(Palindrome.isPalindromeLinkedList(head));
    }

    @Test
    public void testCase_isSame(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        Palindrome.printList("List A: ", head);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(2);
        head2.next.next.next = new ListNode(2);
        Palindrome.printList("List B: ", head2);

        System.out.println(Palindrome.isEqual(head, head2));

    }
}
