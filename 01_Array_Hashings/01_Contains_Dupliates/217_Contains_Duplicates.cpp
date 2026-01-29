#include <vector>
#include <unordered_set>

class Solution {
public:
    bool hasDuplicate(std::vector<int>& nums) {
        std::unordered_set<int> nums_set;
        for (int num : nums){
            if (nums_set.count(num)) {
                return true;
            }
            nums_set.insert(num);
        }
        return false;
    }
};