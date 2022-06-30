class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->(b[0]*b[0]+b[1]*b[1]-a[0]*a[0]-a[1]*a[1]));
        for (int[] point : points) {
            if(pq.size()>=k){
                int[] maxPoint = pq.peek();
                boolean further = compare(maxPoint, point);
                if(further){
                    pq.poll();
                    pq.offer(point);
                }
            }else{
                pq.offer(point);
            }
        }
        return pq.toArray(new int[pq.size()][]);
    }

    private boolean compare(int[] maxPoint, int[] point) {
        return maxPoint[0]*maxPoint[0]+maxPoint[1]*maxPoint[1]-point[0]*point[0]-point[1]*point[1]>0;
    }
}