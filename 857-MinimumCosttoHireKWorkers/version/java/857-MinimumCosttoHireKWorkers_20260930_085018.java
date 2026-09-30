// Last updated: 9/30/2026, 8:50:18 AM
1class Solution {
2    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
3        int n = quality.length;
4        double minCost = Double.MAX_VALUE;
5        double qualityTillNow = 0;
6
7        List<Worker> workers = new ArrayList<>();
8
9        for (int i = 0; i < n; i++) {
10            workers.add(new Worker(wage[i] / (double) quality[i], quality[i]));
11        }
12
13        Collections.sort(workers);
14
15        PriorityQueue<Integer> highQualityWorkers = new PriorityQueue<>(Comparator.reverseOrder());
16
17        for (Worker worker : workers) {
18            double ratio = worker.ratio;
19            int qua = worker.quality;
20
21            qualityTillNow += qua;
22            highQualityWorkers.add(qua);
23
24            if (highQualityWorkers.size() > k) {
25                qualityTillNow -= highQualityWorkers.poll();
26            }
27
28            if (highQualityWorkers.size() == k) {
29                minCost = Math.min(minCost, qualityTillNow * ratio);
30            }
31        }
32
33        return minCost;
34    }
35    private class Worker implements Comparable<Worker> {
36        double ratio;
37        int quality;
38
39        Worker(double ratio, int quality) {
40            this.ratio = ratio;
41            this.quality = quality;
42        }
43
44        @Override
45        public int compareTo(Worker other) {
46            return Double.compare(this.ratio, other.ratio);
47        }
48    }
49}