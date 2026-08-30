# Last updated: 8/30/2026, 8:31:07 AM
1class Solution(object):
2    def sumDecoded(self, nums):
3        """
4        :type nums: List[int]
5        :rtype: int
6        """
7        m = 10**9+7
8        v = nums[:]
9        t=0
10        for num in nums:
11            w= num%10
12            d = num//10
13            d_s = str(d)
14            x= int(d_s[:w])
15            y = int(d_s[w:])
16            t = (t+pow(x,y,m))%m
17        return t