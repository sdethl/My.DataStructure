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

    /**
     * Summary of the issue type:
     * Find duplicates in a one-dimensional array of integers in O(N)
     * running time where the integer values are smaller than the length of the array
     *
     * 1. brute-force: comparing items with all the rest, O(N^2)
     * 2. Hashmap: pros - not a in-place algorithm
     * 3. absolute value: O(N) and in-place
     *
     */

    public boolean hasDup(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int n:nums){
            if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }else map.put(n, 1);
        }
        for(int n: map.values()){
            if(n>1) return true;
        }
        return false;
    }

    /**
     * algorithm:
     * 1. loop each element
     * 2. check sign of nums[abs(nums[i])]
     * 3. if positive, flip
     * 4. if negative, found the dup
     *
     */
    public boolean hasDupInPlace(int[] nums){
        for(int i=0; i<nums.length; i++){
            if( nums[Math.abs(nums[i])] > 0){
                nums[Math.abs(nums[i])] = -nums[Math.abs(nums[i])];
            }
            else{
                return true;
            }
        }
        return false;
    }
}
