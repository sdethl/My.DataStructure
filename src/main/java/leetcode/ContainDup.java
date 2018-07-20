package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainDup {
    /**
     * # 217. Contains Duplicate
     * Given an array of integers, find if the array contains any duplicates.
     Your function should return true if any value appears at least twice in the array,
     and it should return false if every element is distinct.
     */

    public static boolean hasDup(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        boolean result = false;
        for(int n:nums){
            if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }else map.put(n, 1);
        }
        for(int n: map.values()){
            if(n>1)
                result = true;
            break;
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,8};
        System.out.println(hasDup(nums));
    }
}
