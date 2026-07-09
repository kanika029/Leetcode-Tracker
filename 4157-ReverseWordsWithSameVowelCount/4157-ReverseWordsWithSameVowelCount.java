// Last updated: 7/9/2026, 3:05:18 PM
class Solution {
    public String reverseWords(String s) {

        String[] w = s.split(" ");

        int first = vow(w[0]);

        for (int i = 1; i < w.length; i++) {
            if (vow(w[i]) == first) {
                w[i] = new StringBuilder(w[i]).reverse().toString();
            }
        }

        return String.join(" ", w);
    }
    int vow(String word) {
        int c = 0;
        for (char ch : word.toCharArray()) {
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                c++;
        }
        return c;
    }
}
