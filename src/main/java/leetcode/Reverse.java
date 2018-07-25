package leetcode;

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


    public static void main(String[] args){
        System.out.println(reverStringToList("good"));
    }
}
