// Last updated: 7/9/2026, 3:06:34 PM
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] winners = new int[100001];
        int[] losers = new int[100001];
        for (int[] m : matches) {
            winners[m[0]]++;
            losers[m[1]]++;
        }
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();
        for (int i = 1; i <= 100000; i++) {
            if (winners[i] + losers[i] >= 1 && losers[i] == 0) {
                ans1.add(i);
            } else if (winners[i] + losers[i] >= 1 && losers[i] == 1) {
                ans2.add(i);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(ans1);
        ans.add(ans2);
        return ans;
    }
}