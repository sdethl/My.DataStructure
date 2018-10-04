package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {

    /**
     * #242. Valid Anagram
     *
     * Given two strings s and t , write a function to determine if t is an anagram of s.
     * Example 1:
     Input: s = "anagram", t = "nagaram"
     Output: true
     */
    public boolean isAnagram(String s, String t){
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();

        //quick sort, time complexity O(NlogN)
        Arrays.sort(str1);
        Arrays.sort(str2);
        /**
         * Arrays.equals does the following.
         * time complexity is O(N), linear search
         *
         * for (int i=0; i<length; i++)
         *  if (a[i] != a2[i])
         *  return false;
         */
        return Arrays.equals(str1, str2);
        }
}
