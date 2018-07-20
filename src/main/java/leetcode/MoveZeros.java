package leetcode;

import com.sun.deploy.util.ArrayUtil;
import com.sun.deploy.util.StringUtils;

import java.util.LinkedList;
import java.util.List;

public class MoveZeros {

    /**
     * #283. Move Zeroes
     * Given an array nums, write a function to move all 0's to the end of it
     * while maintaining the relative order of the non-zero elements.
     Example:
     Input: [0,1,0,3,12]
     Output: [1,3,12,0,0]
     */
    public static int[] moveElements(int[] nums){
        LinkedList<Integer> list = new LinkedList<>();
        for(int i : nums){
            if( i != 0 )
                list.add(i);
        }
        for(int i : nums){
            if( i == 0)
                list.add(i);
        }
        return list.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args){
        int[] nums = {1,0,3,0,5};
        int[] resolved = moveElements(nums);
        for(int i:resolved){
            System.out.print(i + ",");
        }
    }
}
