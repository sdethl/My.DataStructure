package leetcode.Apple;

import java.util.Arrays;

public class ReverseWords {

    public String reverseWords(String s){
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        for(int i=0; i<words.length; i++){
            words[i] = sb.append(words[i]).reverse().toString();
        }
        return Arrays.toString(words);
    }

    public String reverseWords2(String s){
        return "";
    }
}
