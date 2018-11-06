package leetcode.Apple;

public class MaxSuarray {
    /**
     * #53 Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
     *
     * Example:
     *
     * Input: [-2,1,-3,4,-1,2,1,-5,4],
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     *
     */
    public int findMaxSum(int[] nums){
        if( nums.length == 1){
            return nums[0];
        }
        int max = nums[0];
        int maxCurrent = nums[0];
        for( int i=1; i<nums.length; i++ ){
            maxCurrent = Math.max(maxCurrent + nums[i], maxCurrent);
            max = Math.max(maxCurrent,max);
        }
        return max;
    }

    public int findMaxProduct(int[] nums){
        return 0;
    }

    public int findBestTimeToSellStock(int[] nums){
        int maxProfit = 0;
        int minBuy = nums[0];
        for( int i =0; i<nums.length; i++ ){
            minBuy = Math.min(minBuy, nums[i]);
            int profit = nums[i] - minBuy;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

    public int degreeOfArray(int[] nums){
        return 0;
    }
}
