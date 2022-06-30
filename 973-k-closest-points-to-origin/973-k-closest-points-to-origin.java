class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {

                int aDistance = getDistance(a);
                int bDistance = getDistance(b);
                return bDistance - aDistance;
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
    
    private int getDistance(int [] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}