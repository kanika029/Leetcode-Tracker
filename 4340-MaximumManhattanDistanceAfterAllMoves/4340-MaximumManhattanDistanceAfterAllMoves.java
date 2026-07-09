// Last updated: 7/9/2026, 3:05:09 PM
class Solution {
    public int maxDistance(String moves) {
        int x=0;
        int y=0;
        int w=0;
        int n= moves.length();
        for(int i=0;i<n;i++){
            char ch = moves.charAt(i);
            if(ch=='R') x++;
            else if(ch=='L') x--;
            else if(ch=='U') y++;
            else if(ch=='D') y--;
            else if(ch=='_') w++;
        }
             return Math.abs(x)+Math.abs(y)+w;
    }
}