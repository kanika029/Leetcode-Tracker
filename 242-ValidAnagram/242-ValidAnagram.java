// Last updated: 7/9/2026, 3:08:18 PM
class Solution {
    public boolean isAnagram(String s, String t) {
    //   int[] a = new int[26];
       HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) +1);
        }
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) -1);
        }
        for (int val : map.values()) {
            if (val != 0) return false;
        }
        return true;
    }
}