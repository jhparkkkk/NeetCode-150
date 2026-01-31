class Solution {
    public int[] twoSum(int[] nums, int target) {
        Dictionary<Integer, Integer> seen = new Hashtable<>();

        for (int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if (seen.get(complement) != null){
                return new int[] {seen.get(complement), i};
            }
            seen.put(nums[i], i);

        }

        return(new int[] {});
    }
}
