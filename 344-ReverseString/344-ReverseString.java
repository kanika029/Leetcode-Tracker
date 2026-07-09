// Last updated: 7/9/2026, 3:08:01 PM
class Solution {
    public void reverseString(char[] s) {
        int l=0,r=s.length-1;

        while(l<r){
            char t=s[l];
            s[l]=s[r];
            s[r]=t;
            l++;
            r--;
        }
    }
}