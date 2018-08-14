package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Recursion {

    public StringBuilder sb = new StringBuilder();
    /**
     * 273. Integer to English Words
     *
     * todo: fix the initial issue
     *
     */
    public String numberToWords(int num){
        String s = helper(num);
        System.out.println(s);
        sb.setLength(0);
        return s;
    }
    private String helper(int num){
        //StringBuilder sb = new StringBuilder();
        String text = "";
        Map<Integer, String> map = new HashMap();
        map.put(90, "Ninety");
        map.put(80, "Eighty");
        map.put(70, "Seventy");
        map.put(60, "Sixty");
        map.put(50, "Fifty");
        map.put(40, "Forty");
        map.put(30, "Thirty");
        map.put(20, "Twenty");
        map.put(19, "Nineteen");
        map.put(18, "Eighteen");
        map.put(17, "Seventeen");
        map.put(16, "Twenty");
        map.put(15, "Fifteen");
        map.put(14, "Fourteen");
        map.put(13, "Thirteen");
        map.put(12, "Twelve");
        map.put(11, "Eleven");
        map.put(10, "Ten");
        map.put(9, "Nine");
        map.put(8, "Eight");
        map.put(7, "Seven");
        map.put(6, "Six");
        map.put(5, "Five");
        map.put(4, "Four");
        map.put(3, "Three");
        map.put(2, "Two");
        map.put(1, "One");

        if( num>= 1000*1000*1000){
            int r = num%(1000*1000*1000);
            int result = (num-r)/(1000*1000*1000);
            helper(result);
            //sb.append(" Billion ");
            text = text + " Billion ";
            helper(r);
        }
        else if( num>=1000*1000){
            int r = num%(1000*1000);
            int result = (num-r)/(1000*1000);
            helper(result);
            sb.append(" Million ");
            helper(r);
        }
        else if( num>=1000){
            int r = num%1000;
            int result = (num-r)/1000;
            helper(result);
            sb.append(" Thousand ");
            helper(r);
        }
        else if( num>=100){
            int r = num%100;
            text = map.get((num-r)/100);
            sb.append(text + " Hundred ");
            helper(r);
        }
        else if( num>=20){
            int r = num%10;
            text = map.get((num-r));
            sb.append(text + " ");
            helper(r);
        }
        else if( num>=10){
            text = map.get(num);
            sb.append(text + " ");
        }
        else if( num>0){
            text = map.get(num);
            sb.append(text + " ");
        }
        return sb.toString().trim();
    }

    /**
     * Array
     */
    private final String[] belowTen = new String[] {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private final String[] belowTwenty = new String[] {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] belowHundred = new String[] {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords2(int num) {
        if (num == 0) return "Zero";
        return helper2(num);
    }

    private String helper2(int num) {
        String result = new String();
        if (num < 10) result = belowTen[num];
        else if (num < 20) result = belowTwenty[num -10];
        else if (num < 100) result = belowHundred[num/10] + " " + helper2(num % 10);
        else if (num < 1000) result = helper2(num/100) + " Hundred " +  helper2(num % 100);
        else if (num < 1000000) result = helper2(num/1000) + " Thousand " +  helper2(num % 1000);
        else if (num < 1000000000) result = helper2(num/1000000) + " Million " +  helper2(num % 1000000);
        else result = helper2(num/1000000000) + " Billion " + helper2(num % 1000000000);
        return result.trim();
    }


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
