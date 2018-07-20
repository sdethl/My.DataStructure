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
    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
        }

    private static Map<Character, Integer> stringToMap(String string){
        Map<Character, Integer> map = new HashMap();
        for(char c : string.toCharArray()){
            if( !map.containsKey(c) )
                map.put(c, 1);
            else map.put(c, map.get(c)+1);
        }
        return map;
    }

    public static void main(String[] args){
        System.out.println(isAnagram("aaaa", "aa"));
    }
}
