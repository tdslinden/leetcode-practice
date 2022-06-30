class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {

                double aDistance = (Math.pow(a[0], 2) + Math.pow(a[1], 2));
                double bDistance = (Math.pow(b[0], 2) + Math.pow(b[1], 2));
                return Double.compare(bDistance, aDistance);
            }
        });
        
        int size = 0;
        
        for (int[] point : points) {
            pq.offer(point);
            size++;
            if (size > k) {
                pq.poll();                
                size--;
            }
        }
        
        int[][] ans = new int[k][2];
        int i = 0;
        while (k-- > 0) {
            ans[i++] = pq.poll();
        }
        
        return ans;
    }
}