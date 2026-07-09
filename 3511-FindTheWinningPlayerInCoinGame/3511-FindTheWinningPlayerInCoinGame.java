// Last updated: 7/9/2026, 3:05:23 PM
class Solution {
    public String winningPlayer(int x, int y) {
        boolean aliceTurn = true;
        while (true) {
            if (x >= 1 && y >= 4) {
                x -= 1;
                y -= 4;
            } else {
                return aliceTurn ? "Bob" : "Alice";
            }
            aliceTurn = !aliceTurn;
        }
    }
}
