package leetcode;

public class BestTimeToBuyAndSell {

    /**
     *  #121. Best Time to Buy and Sell Stock
     *
     *  Say you have an array for which the ith element is the price of a given stock on day i.
     If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock),
     design an algorithm to find the maximum profit.
     Note that you cannot sell a stock before you buy one.
     */

    public static int returnProfit(int[] nums){
        int profit =0;
        int length = nums.length;
        for(int i= length-1; i>0; i--){
            for(int j= length-2; j>=0; j--){
                int tmp = nums[i] - nums[j];
                if ( tmp > profit )
                    profit = tmp;
            }
        }
        return profit;
    }

    public static void main(String[] args){
        int[] stock = {7, 1, 5, 3, 6, 4};
        System.out.println(returnProfit(stock));
    }
}
