package leetcode;

import search.BinarySearch;

import java.util.HashMap;
import java.util.Map;

public class TwoNumbers {

    /**
     * Leet code #1
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     You may assume that each input would have exactly one solution, and you may not use the same element twice.
     */
    // brute force: O(N^2) time, O(1) space
    public int[] twoSum(int[] nums, int target) {
        if( nums.length == 1 && nums[0] == target){
            return new int[]{0};
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    //O(n) time, O(n)space
    public int[] twoSumMap(int[] nums, int target){
        if(nums.length==1 && nums[0] == target){
            return new int[]{0};
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length ; i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]), i};
            }
            else
                map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * Leet code #167
     * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
     The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
     */
    //O(n log n ) time, O(1) space
    public int[] twoSumSortedBinarySearch(int[] nums, int target){
        BinarySearch bs = new BinarySearch();
        for(int i=0; i< nums.length; i++){
            int value = target - nums[i];
            int result = bs.iterativeBinarySearch(nums, i+1, nums.length, value);
            return new int[]{result, i};
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    //O(N) time, O(1) space
    public int[] twoSumSorted(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        while( i < j){
            if((nums[i] + nums[j]) > target) {
                j--;
            }
            else if( (nums[i] + nums[j]) < target){
                i++;
            }
            else
                return new int[] {i, j};
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * Design and implement a Sums class. It should support the following operations: add and find
     * add(input) Add the number input to an internal data structure
     * find(value) Find if there exists any pair of numbers which sum is equal to the value
     */


}
