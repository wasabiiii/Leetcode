/**
 * Say you have an array for which the ith element is the price of a given stock on day i.

 If you were only permitted to complete at most one transaction
 (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

 假设你有一个数组，其中i元素是给定股票在第i天的价格。

 如果你只允许最多完成一个交易（即买入一个股票，卖出一份股票），设计一个最大利润的算法。
 */


public class Solution121 {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        if(prices == null || length < 2 ){
            return 0;
        }

        int minprice = prices[0];
        int maxprofit = 0;

        for (int i = 1; i < length; i++) {
            minprice = Math.min(prices[i-1],minprice);
            if(prices[i] - minprice > maxprofit){
                maxprofit = prices[i] - minprice;
            }
        }

        return maxprofit;
    }

    public static void main(String[] args){
        Solution121 test = new Solution121();
        int[] prices = {7,1,5,3,6,4};
        test.maxProfit(prices);
    }
}
