// Last updated: 7/9/2026, 3:05:34 PM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        if (purchaseAmount%10 <= 4){
            return 100-(purchaseAmount/10)*10;
        }else{
            return 100-((purchaseAmount/10)+1)*10;
        }
    }
}