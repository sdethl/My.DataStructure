package leetcode;

public class Recursion {

    /**
     * #70. Climbing Stairs
     *
     * You are climbing a stair case. It takes n steps to reach to the top.
     Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     Note: Given n will be a positive integer.
     Example 1:
     Input: 2
     Output: 2
     Explanation: There are two ways to climb to the top.
     1. 1 step + 1 step
     2. 2 steps
     *
     */
    public static int ClimbingStairs(int steps){
        //at least one way which is 1,1
        int result = 1;
        if (steps==1)
            return result;
        int i = 1;
        int j = 2;
        if(steps%j == 0){
            result++;
        }
        return result;
    }

    /**
     *  #202. Happy Number
     *  Write an algorithm to determine if a number is "happy".
     *  Example:
     Input: 19
     Output: true
     Explanation:
     12 + 92 = 82
     82 + 22 = 68
     62 + 82 = 100
     12 + 02 + 02 = 1
     */

}
