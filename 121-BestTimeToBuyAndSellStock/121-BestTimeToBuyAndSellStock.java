// Last updated: 7/9/2026, 3:09:40 PM
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minprice = prices[0];
        int profit =0;
        for( int i=0;i<n;i++){
            if(prices[i]<minprice){
                minprice = prices[i];
            }else{
                profit = Math.max(profit,prices[i]-minprice);
            }
        }
        return profit;
    }
}