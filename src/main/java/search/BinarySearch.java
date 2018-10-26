package search;

public class BinarySearch {

    /**
     * Binary Search algorithm:
     * 1. Data must be ordered
     * 2. chooses the element in the middle of the array and compares it against the search value
     * 3. if element is equal to the value, we are done
     * 4. if element is greater than the value, search the left half of the array
     * 5. if element is less than the value, search the right half of the array
     *
     * O(logn) time
     */

    public int recursiveBinarySearch(int[] nums, int start, int end, int value){
        if( start > end){
            return -1;
        }
        int mid = (start + end) / 2;
        if(nums[mid] == value)
            return mid;
        else if( value < nums[mid]){
            return recursiveBinarySearch(nums, start, mid, value);//left
        }
        else
            return recursiveBinarySearch(nums, mid+1, end, value); //right
    }

    public int iterativeBinarySearch(int[] nums, int start, int end, int value){
        start = 0;
        end = nums.length;
        while( start < end ){
            int mid = (start + end)/2;
            if( nums[mid] == value)
                return  mid;
            else if( value < nums[mid]){ //left
                end = mid;
            }else
                start = mid + 1; //right
        }
        return -1;
    }
}
