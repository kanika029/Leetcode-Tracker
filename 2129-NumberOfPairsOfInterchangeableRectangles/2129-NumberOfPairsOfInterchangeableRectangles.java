// Last updated: 7/9/2026, 3:05:57 PM
class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        // long count =0;
        int n = rectangles.length;
        // for(int i=0;i<n;i++){
        //     float ratio = (float)rectangles[i][0]/rectangles[i][1];
        //     for(int j =i+1;j<n;j++){
        //         float ratio2 = (float)rectangles[j][0]/rectangles[j][1];
        //         if(ratio==ratio2){
        //             count++;
        //         }
        //     }
        // }
        // return count;

        
        double[] ratio = new double[n];
        for (int i = 0; i < n; i++) {
            ratio[i] = (double) rectangles[i][0] / rectangles[i][1];
        }
        Arrays.sort(ratio);
        long ans = 0, count = 1;
        for (int i = 1; i < n; i++) {
            if (ratio[i] == ratio[i - 1]) {
                count++;
            } else {
                ans += count * (count - 1) / 2;
                count = 1;
            }
        }
        ans += count * (count - 1) / 2;
        return ans;
    }
}