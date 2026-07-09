// Last updated: 7/9/2026, 3:05:44 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (k<=numOnes) {
            return k;
        }else if (k<=numOnes+numZeros){
            return numOnes;
        }else{
           int sum = k-(numOnes+numZeros);
           return numOnes - sum;
        }
    }
}