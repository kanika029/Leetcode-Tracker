// Last updated: 8/9/2026, 8:55:11 AM
1class Solution {
2    public double minPrice(int[] prices, int[] discounts) {
3        Arrays.sort(prices);
4        Arrays.sort(discounts);
5        int a =prices.length;
6        int b = discounts.length;
7        double tot =0;
8        for(int p:prices) tot+=p;
9        int i=a-1;
10        int j = b-1;
11
12        while(i>=0 &&j>=0){
13            double sav = prices[i] *discounts[j]/100.0;
14            tot-=sav;
15            i--;
16            j--;
17        }
18        return tot;
19    }
20}