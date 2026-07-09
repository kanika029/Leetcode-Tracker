// Last updated: 7/9/2026, 3:06:20 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int pri = 0;
        for (int i=0 ; i<n ; i++){
            pri += mat[i][i];
            pri += mat[i][n-i-1];
        }
        if(n %2!=0){
            pri -=  mat[n/2][n/2];
        }
        return pri;
    }
}