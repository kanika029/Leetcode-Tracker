// Last updated: 7/9/2026, 3:10:51 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans =0;
        int n= s.length();
        for(int i=0;i<n;i++){
            int[] fre = new int[256];
            for(int j=i;j<n;j++){
                if (fre[s.charAt(j)] >0) {
                    break;
                }
                else{
                    fre[s.charAt(j)]++;
                }
                ans = Math.max(ans,j-i+1);
            }
        }
        return ans;
    }
}