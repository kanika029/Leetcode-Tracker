// Last updated: 8/2/2026, 9:15:20 AM
1class Solution {
2    public int countPrimes(int n) {
3        boolean[] prime = new boolean[n];
4        int cnt=0;
5        for (int i = 2; i < n; i++) {
6            prime[i] = true;
7        }
8
9        for (int i = 2;i < n; i++) {
10            if (prime[i]) {
11                cnt++;
12                for (int j = i * 2; j < n; j += i) {
13                    prime[j] = false;
14                }
15            }
16        }
17        return cnt;
18    }
19}