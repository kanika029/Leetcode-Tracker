// Last updated: 8/2/2026, 9:22:51 AM
1class Solution {
2    int sum = 0;
3
4    public int sumNumbers(TreeNode root) {
5        helper(root, 0);
6        return sum;
7    }
8
9    void helper(TreeNode node, int path) {
10        if (node == null) return;
11        path = path * 10 + node.val;
12        if (node.left == null && node.right == null) {
13            sum += path;
14        }
15        helper(node.left, path);
16        helper(node.right, path);
17    }
18}