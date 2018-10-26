package leetcode.Apple;

public class PivotIndex {

    //724. Find pivot index
    public int pivotIndex(int[] nums){
        // right = sum - left - pivot
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
