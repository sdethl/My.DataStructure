package leetcode.Apple;

public class PivotIndex {

    //724. Find pivot index
    /**
     * Example 1:
     * Input:
     * nums = [1, 7, 3, 6, 5, 6]
     * Output: 3
     * Explanation:
     * The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.
     * Also, 3 is the first index where this occurs.
     *
     */
    public int pivotIndex(int[] nums){
        // right = sum - left - pivot
        // pivot = sum - (left + right)
        if( nums.length == 1){
            return -1;
        }
        int sum = 0;
        int leftSum = 0;
        for( int num : nums){
            sum += num;
        }
        for(int i=0; i<nums.length; i++){
            if( nums[i] == sum - leftSum * 2){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
