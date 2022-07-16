class Solution {
    public int[][] merge(int[][] intervals) {
        
        // sort intervals
        Arrays.sort(intervals, (o1,o2) -> o1[0]-o2[0]);
        
        ArrayList<int[]> temp = new ArrayList<>();
        
        // initial range 
        int s = intervals[0][0];
        int e = intervals[0][1];
        
        int i = 1;
        while (i < intervals.length) {
            int ns = intervals[i][0];
            int ne = intervals[i][1];
            
            if (ns <= e) {
                e = Math.max(ne, e);
            } else {
                temp.add(new int[]{s,e});
                s = ns;
                e = ne;
            }
            i++;
        }
        
        // last interval will always be missing whether it is merged or not;
        temp.add(new int[]{s,e});
        
        
        int[][] arr = new int[temp.size()][2];
        int j = 0;
        for (int[] pair : temp) {
            arr[j][0] = pair[0];
            arr[j][1] = pair[1];
            j++;
        }
        
        return arr;
    }
}