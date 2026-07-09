// Last updated: 7/9/2026, 3:06:23 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        int empty = numBottles;
        while(empty >= numExchange){
            int newb = empty / numExchange;
            total +=newb;
            empty = empty % numExchange + newb;
        }
        return total;
    }
}