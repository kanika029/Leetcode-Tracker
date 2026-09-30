# Last updated: 9/30/2026, 8:47:53 AM
1class Solution(object):
2    def intersection(self, nums1, nums2):
3        set1 = set(nums1)
4        set2 = set(nums2)
5        return list(set1.intersection(set2))