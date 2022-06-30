class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // just need to compare each point with the origin
        // if k is full, drop the last value since first value should be min
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {

                double aDistance = (Math.pow(a[0], 2) + Math.pow(a[1], 2));
                double bDistance = (Math.pow(b[0], 2) + Math.pow(b[1], 2));
                return Double.compare(bDistance, aDistance);
            }
        });
        
        for (int[] point : points) {
            if (pq.size() < k) {
                pq.offer(point);
            } else {
                pq.offer(point);
                pq.poll();
            }
        }
        
        int[][] ans = new int[k][2];
        int i = 0;
        
        while (pq.size() > 0) {
            ans[i++] = pq.poll();
        }
        
        return ans;
    }
}