package leetcode;

public class BestTimeToBuyAndSell {

    /**
     *  #121. Best Time to Buy and Sell Stock
     *
     *  Say you have an array for which the ith element is the price of a given stock on day i.
     If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock),
     design an algorithm to find the maximum profit.
     Note that you cannot sell a stock before you buy one.
     *
     * algorithm: greedy algorithm
     *
     *  1. take care of the edge cases
     *  2. initialize
     *      max_profit = 0
     *      min_stock_price = a[0]
     *
     *  3. loop each element:
     *      a. compare a[i] and min_stock_price,
     *          find the min
     *      b. a[i] - min,
     *          find the profit
     *      c. compare max_profit and profit
     *          find the max
     *  4. return the max profit
     */

    //brute force
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

    public static int greedyFindProfit(int[] nums){
        int maxProfit = 0;
        int minStockPrice = nums[0];
        for(int n : nums){
            int min = Math.min( n, minStockPrice);
            int profit = n - min;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }


    public static void main(String[] args){
        int[] stock = {0, 1, 5, 3, 6, 4};
        System.out.println(greedyFindProfit(stock));
    }
}
