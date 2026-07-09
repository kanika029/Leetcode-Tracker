// Last updated: 7/9/2026, 3:10:13 PM
class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        String a = words[words.length-1];
        int L = a.length();
        return L;
    }
}