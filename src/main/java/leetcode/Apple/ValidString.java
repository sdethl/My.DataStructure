package leetcode.Apple;

import common.Util;
import java.util.Arrays;

public class ValidString {

    public boolean isPalindrome(String s){
        int len = s.length();
        if( len == 1){
            return true;
        }
        s = Util.lowCaseLetterOnly(s);
        StringBuilder sb = new StringBuilder();
        String reverse = sb.append(s).reverse().toString();
        return reverse.equals(s);
    }

    public boolean isAnagram(String s){
        int len = s.length();
        if( len == 1){
            return true;
        }
        s = Util.lowCaseLetterOnly(s);
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return s.equals(String.valueOf(chars));
    }
}
