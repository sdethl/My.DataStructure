package leetcode.Apple;


public class LongestCommonPrefix {
    /**
     * # 14. Write a function to find the longest common prefix string amongst an array of strings.     *
     * If there is no common prefix, return an empty string "".
     *
     * Example 1:     *
     * Input: ["flower","flow","flight"]
     * Output: "fl"
     *
     * Example 2:     *
     * Input: ["dog","racecar","car"]
     * Output: ""
     * Explanation: There is no common prefix among the input strings.
     */
    public String getPrefix(String[] strings){
        String templatePrefix = commonPrefix(strings[0], strings[1]);
        String result = "";
        for(int i=2; i<strings.length; i++){
            result = commonPrefix(templatePrefix, strings[i]);
        }
        return result;
    }

    private String commonPrefix(String s1, String s2){
        if( s1.equals(s2)){
            return s1; //when the same strings
        }
        int length;
        String shortString;
        if( s1.length() < s2.length()){
            length = s1.length();
            shortString = s1;
        }else {
            length = s2.length();
            shortString = s2;
        }

        for( int i=0; i< length; i++){
            if( s1.charAt(0) != s2.charAt(0)){
                return "No common prefix"; //when no common
            }else if( s1.charAt(i) != s2.charAt(i) ){
                return s1.substring(0, i-1);    //when found a common substring
            }
        }
        return shortString;
    }
}
