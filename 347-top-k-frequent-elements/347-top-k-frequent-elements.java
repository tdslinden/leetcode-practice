class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(new Comparator<>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> pair1, Map.Entry<Integer, Integer> pair2) {
                return pair2.getValue() - pair1.getValue();
            }  
            
        });
        
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            pq.offer(pair);
        }
        
        int[] ans = new int[k];
        int i = 0;
        while(k > 0) {
            ans[i++] = pq.poll().getKey();
            k--;
        }
        
        return ans;
    }
}