// Last updated: 7/9/2026, 3:10:04 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n-1;

        while (i<m && j>=0){
             if (matrix[i][j] == target) return true;
            else if (target>matrix[i][j]) i+=1;
            else if (target<matrix[i][j]) j-= 1;
        }
 return false;
    }
}