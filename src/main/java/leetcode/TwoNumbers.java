package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoNumbers {

    /**
     * Leet code #1
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     You may assume that each input would have exactly one solution, and you may not use the same element twice.
     */
    // N(O2)
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * Leet code #167
     * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
     The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
     */
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args){
        int nums[] = {7,11,15,2};
        int[] result = twoSum(nums, 9);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
