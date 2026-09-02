// Last updated: 9/2/2026, 9:39:01 AM
1public class Solution {
2public int[] searchRange(int[] nums, int target) {
3    int[] result = new int[2];
4    result[0] = findFirst(nums, target);
5    result[1] = findLast(nums, target);
6    return result;
7}
8
9private int findFirst(int[] nums, int target){
10    int idx = -1;
11    int start = 0;
12    int end = nums.length - 1;
13    while(start <= end){
14        int mid = (start + end) / 2;
15        if(nums[mid] >= target){
16            end = mid - 1;
17        }else{
18            start = mid + 1;
19        }
20        if(nums[mid] == target) idx = mid;
21    }
22    return idx;
23}
24
25private int findLast(int[] nums, int target){
26    int idx = -1;
27    int start = 0;
28    int end = nums.length - 1;
29    while(start <= end){
30        int mid = (start + end) / 2;
31        if(nums[mid] <= target){
32            start = mid + 1;
33        }else{
34            end = mid - 1;
35        }
36        if(nums[mid] == target) idx = mid;
37    }
38    return idx;
39}
40}