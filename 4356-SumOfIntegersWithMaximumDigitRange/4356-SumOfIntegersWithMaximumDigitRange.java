// Last updated: 7/9/2026, 3:05:15 PM
class Solution {
    public int maxDigitRange(int[] nums) {
        int max= -1;
        int [] a = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            int m1=0;
            int m2 =9;
            while(n>0){
                int d = n%10;
                m1 = Math.max(m1,d);
                m2= Math.min(m2,d);
                n/=10;
            }
            a[i] = m1-m2;
            max = Math.max(max,a[i]);
            
        }
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(a[i]==max){
                s+=nums[i];
            }
        }
        return s;
    }
}