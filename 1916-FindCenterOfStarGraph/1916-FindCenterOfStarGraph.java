// Last updated: 7/9/2026, 3:06:09 PM
class Solution {
    public int findCenter(int[][] edges) {
        return edges[0][0] == edges[1][0]
        || edges[0][0] == edges[1][1] ? edges[0][0] : edges[0][1];
    }
}