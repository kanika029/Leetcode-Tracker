// Last updated: 8/2/2026, 9:48:10 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10public class Codec {
11
12    // Encodes a tree to a single string.
13    public String serialize(TreeNode root) {
14        if (root == null) return "null";
15
16        StringBuilder sb = new StringBuilder();
17        Queue<TreeNode> q = new LinkedList<>();
18        q.add(root);
19
20        while (!q.isEmpty()) {
21            TreeNode curr = q.poll();
22
23            if (curr == null) {
24                sb.append("null,");
25                continue;
26            }
27
28            sb.append(curr.val).append(",");
29            q.add(curr.left);
30            q.add(curr.right);
31        }
32
33        return sb.toString();
34    
35    }
36
37    // Decodes your encoded data to tree.
38    public TreeNode deserialize(String data) {
39        if (data.equals("null")) return null;
40
41        String[] arr = data.split(",");
42        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
43        Queue<TreeNode> q = new LinkedList<>();
44        q.add(root);
45        int i = 1;
46
47        while (!q.isEmpty() && i < arr.length) {
48            TreeNode curr = q.poll();
49
50            if (!arr[i].equals("null")) {
51                curr.left = new TreeNode(Integer.parseInt(arr[i]));
52                q.add(curr.left);
53            }
54            i++;
55
56            if (i < arr.length && !arr[i].equals("null")) {
57                curr.right = new TreeNode(Integer.parseInt(arr[i]));
58                q.add(curr.right);
59            }
60            i++;
61        }
62        return root;
63    }
64}
65
66// Your Codec object will be instantiated and called as such:
67// Codec ser = new Codec();
68// Codec deser = new Codec();
69// TreeNode ans = deser.deserialize(ser.serialize(root));