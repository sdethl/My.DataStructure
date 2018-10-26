package leetcode.Apple;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    //#1. Find 2 numbers that add up to a target, return a list of their index
    // Time: O(N), Space O(N)

    public int[] twoSum1(int[] nums, int target){
        //key: value => value: index
        Map<Integer, Integer> m = new HashMap();

        for(int i =0; i<nums.length; i++){
            int x = target - nums[i];
            if( m.containsKey(x)){
                return new int[] {i, m.get(x)};
            }
            else
                m.put(nums[i], i);
        }
        throw new IllegalArgumentException("can't find!");
    }

    //# The array int[] nums is already sorted
    // For sorted array, binary search, O(N), O(logn)
    public int[] twoSumInSorted1(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            int key = target - nums[i];
            int index = binarySearch(nums, key, 0, nums.length-1);
            if( index != -1) {
                return new int[] {index, i};
            }
        }
        throw  new IllegalArgumentException("cant find!");
    }


    private int binarySearch(int[] nums, int key, int start, int end){
        int mid = ( start + end )/2;
        if( key == mid) return mid;
        if( key < nums[mid]){
            return binarySearch(nums, key, start, mid);
        }else if( key > nums[mid]){
            return binarySearch(nums, key, mid+1, end);
        }
        return -1;
    }

    // In-place solution
    // Time O(N/2),
    public int[] twoSumInSorted2(int[] nums, int target){
        int i=0, j = nums.length-1;
        while( i < j){
            int sum = nums[i] + nums[j];
            if( sum == target){
                return new int[] {i, j};
            }
            if( sum < target){
                i++;
            }else{
                j++;
            }
        }
        throw new IllegalArgumentException("cant find!");
    }
}
