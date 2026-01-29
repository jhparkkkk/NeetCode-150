import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> nums_set = new HashSet<>();

        for (int num : nums){
            if (nums_set.contains(num)){
                return true;
            }
            nums_set.add(num);
        }

        return false;
    }
}