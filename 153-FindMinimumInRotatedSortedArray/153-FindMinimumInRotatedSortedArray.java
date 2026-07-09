// Last updated: 7/9/2026, 3:09:19 PM
class Solution {
    public int findMin(int[] nums) {
       int i =0;
       int n= nums.length;
       int j = n-1;
       int ans = Integer.MAX_VALUE;
       int mid;
       while(i<=j){
        mid = (i+j)/2;
        if(nums[i]<=nums[j]){
            ans= Math.min(ans,nums[i]);
            break;
        }
        else if(nums[mid]<nums[i]){
                ans = Math.min(ans,nums[mid]);
                j=mid-1;
        }
        else{
            ans= Math.min(ans,nums[mid]);
            i=mid+1;
        }
    }
    return ans;

    }
}