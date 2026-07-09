// Last updated: 7/9/2026, 3:08:17 PM
class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
        return 1 + (num - 1) % 9;
    }
}