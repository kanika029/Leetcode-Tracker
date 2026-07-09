// Last updated: 7/9/2026, 3:07:40 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[nums1.length];
        Arrays.fill(res, -1);

        for (int x : nums2) {
            while (!stack.isEmpty() && x > stack.peek()) {
                map.put(stack.pop(), x);
            }
            stack.push(x);
        }

        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                res[i] = map.get(nums1[i]);
            }
        }

        return res;
    }
}
