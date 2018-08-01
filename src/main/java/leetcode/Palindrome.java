package leetcode;

public class Palindrome {

    /**
     * # 125. Valid Palindrome
     * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
     Note: For the purpose of this problem, we define empty string as valid palindrome.
     *
     */
    public static boolean isPalindromeWJDK(String s){
        //A non-word character [^\W]
        String temp = s.replaceAll("\\W", " ").toLowerCase();
        if (s == null || s.isEmpty() || s.trim().length() <1)
            return true;
        String reversed = new StringBuilder().append(temp).reverse().toString();
        if( temp.equals(reversed))
            return true;
        else
            return false;
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
        return b;
    }

    public static void longestPalindrome(String s){
        int length = s.length();
        int longest = 0;
        String result = null;
        for(int i=0; i<(length-1); i++){
            for(int j= i+1; j<length; j++){
                String temp = s.substring(i,j);
                if(isPalindrome(temp) && temp.length()>longest){
                    longest = temp.length();
                    result = temp;
                }
            }
        }
        System.out.println(result);
        System.out.println(longest);
    }

    public static void main(String[] args){
//        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
//        System.out.println(isPalindrome("race a car"));
//        System.out.println(isPalindrome("."));
//        System.out.println(isPalindrome(".,"));
        longestPalindrome("abbacd");

    }
}
