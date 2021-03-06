package leetcode;
import common.Util;

import java.util.ArrayList;
import java.util.List;

public class Reverse{
    /**
     * Leet code : #344. Reverse String
     * Write a function that takes a sb as input and returns the sb reversed.
     *
     * The point:
     * 1. start from (length -1)
     * 2. char array and sb conversion
     */
    public static String reverseStringToList(String input){
        char[] chars = input.toCharArray();
        int len = chars.length;
        char[] reversed = new char[chars.length];
        for(int i= len-1; i>=0; i--){
            reversed[len-1-i] = chars[i];
        }
        return new String(reversed);
    }

    public static String reverseStringWJKD(String input){
        return new StringBuilder().append(input).reverse().toString();
    }

    /**
     * # 7. Reverse Integer
     * Given a 32-bit signed integer, reverse digits of an integer.
     * Example 1:
     Input: 123
     Output: 321

     Note:
     Assume we are dealing with an environment which could only store integers within
     the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem,
     assume that your function returns 0 when the reversed integer overflows.
     */
    public static int reverseIntWJDK(int num){
        String reversed = new StringBuilder().append(Math.abs(num)).reverse().toString();
        return (num < 0) ? (Integer.parseInt(reversed) * -1) : Integer.parseInt(reversed);
    }

    public static int reverseInt(int x){
        int rev = 0;
        while (x != 0) {
            // Pop the last number
            int pop = x % 10;
            x /= 10;
            // max 2147483647;
            // min -2147483648
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    //in-place solution O(N), no extra memory
    public static int[] reverseArrays(int[] nums){
        int start =0;
        int end = nums.length-1;
        if( end == 0 ){
            return nums;
        }
        while( start<end ){
            Util.swap(nums, start, end);
        }
        return nums;
    }

    //in-place, O(n/2)
    public static void reverseWords(String string){
        String[] strs = string.trim().split(" ");
        int i =0;
        int j = strs.length -1;
        String temp;
        while( i <= j){
            temp = strs[j];
            strs[j] = strs[i];
            strs[i] = temp;
            i++;
            j--;
        }
        for(String s : strs){
            System.out.print(s + " ");
        }

    }

    public static void main(String[] args){
        reverseWords("tall is Gavin");
    }
}
