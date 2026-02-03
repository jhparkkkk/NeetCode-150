class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            buckets[count].add(num);
        }
        
        int[] result = new int[k];
        int idx = 0;
        
        for (int i = buckets.length - 1; i > 0 && idx < k; i--) {
            for (int num : buckets[i]) {
                result[idx++] = num;
                if (idx == k) {
                    return result;
                }
            }
        }
        
        return result;
    }
}