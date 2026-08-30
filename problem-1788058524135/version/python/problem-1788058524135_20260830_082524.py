# Last updated: 8/30/2026, 8:25:24 AM
1class Solution(object):
2    def countSpecialIntegers(self, nums):
3        """
4        :type nums: List[int]
5        :rtype: int
6        """
7        s={}
8        seen = set()
9        pre = None
10        for num in nums:
11            if num!= pre:
12                if num in seen:
13                    s[num] = False
14                else:
15                    seen.add(num)
16                    s[num] =True
17            pre =num
18        return sum(1 for v in s.values() if v)