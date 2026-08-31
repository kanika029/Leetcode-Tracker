// Last updated: 8/31/2026, 4:15:34 PM
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3
4        int[] dp = new int[amount + 1];
5
6        Arrays.fill(dp, amount + 1);
7
8        dp[0] = 0;
9
10        for (int i = 1; i <= amount; i++) {
11
12            for (int coin : coins) {
13
14                if (coin <= i) {
15                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
16                }
17            }
18        }
19
20        return dp[amount] > amount ? -1 : dp[amount];
21    }
22}