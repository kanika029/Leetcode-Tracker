// Last updated: 7/9/2026, 3:10:15 PM
class Solution {
    public int[][] merge(int[][] intervals) {
        int n =intervals.length;
      Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> li = new ArrayList<>();
        int[] p = intervals[0];
        for(int i=1;i<n;i++){
            if(intervals[i][0] <= p[1]){
                p[1] = Math.max(p[1],intervals[i][1]);
            }else{
                li.add(p);
                p = intervals[i];
            }
        }
        li.add(p);
        return li.toArray(new int[li.size()][]);
    }
}