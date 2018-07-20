package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    /**
     * #169. Majority Element
     *
     * Given an array of size n, find the majority element.
     * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
       You may assume that the array is non-empty and the majority element always exist in the array.
     */
    public static int theElement(int[] nums){
        int count =0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }
            else map.put(n, 1);
        }
        for (int i : map.values()){
            if( i > nums.length/2){
                count = i;
            }
        }
        return getKeyFromValue(map, count);
    }

    public static String theElement(String[] strs){
        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        for(String str:strs){
            if( map.containsKey(str)){
                map.put(str, map.get(str)+1);
            }else
                map.put(str, 1);
        }
        for(int i: map.values()){
            if(i > strs.length/2){
                count = i;
            }
        }
        return getKeyFromValueStr(map, count);
    }

    public static int theElement(char[] chars){
        return 0;
    }

    private static int getKeyFromValue(Map<Integer, Integer> m, int count){
        int result =0;
        for(int i : m.keySet()){
            if(m.get(i).equals(count)){
                result = i;
            }
        }
        return result;
    }
    private static String getKeyFromValueStr(Map<String, Integer> m, int count){
        String result = null;
        for(String s : m.keySet()){
            if(m.get(s).equals(count)){
                result = s;
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums = {1,3,3,4,4,3,3,4,4,4,4};
        String[] strList = {"today", "today", "yesterday"};
        System.out.println(theElement(strList));
    }
}
