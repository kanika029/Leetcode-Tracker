// Last updated: 7/9/2026, 3:10:45 PM
class Solution {
    public int maxArea(int[] n) {
        int left = 0;
        int right = n.length - 1;
        int maxArea=0;

        while (left < right) {
            int w = right - left;
            int h = Math.min(n[left], n[right]);
            int area = w*h;
            maxArea = Math.max(maxArea, area);

            if (n[left] < n[right]) {
                left++;
            } else {
                right--;
            }
        
    }
    return maxArea;
    }
    
};