class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int n : nums){
            numSet.add(n);
        }


        int max_streak = 0;
        
        for (int n: nums){

            if (!numSet.contains(n - 1)){
                int streak = 1;
                while(numSet.contains(n+1)){
                    streak++;
                    n++;
                }
                if (streak > max_streak){
                    max_streak = streak; 
                }
            }
        }

        return max_streak;
        
    }
}
