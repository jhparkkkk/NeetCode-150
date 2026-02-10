class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        set<int> nums_set(nums.begin(), nums.end());

        int max_streak = 0;
        for (int n: nums){
            bool is_in = nums_set.find(n-1) != nums_set.end();
            if (nums_set.find(n-1) == nums_set.end()){
                cout << n << "is first ele";
                int streak = 1;
                while (nums_set.find(n+1) != nums_set.end()){
                    streak++;
                    n++;
                }

                streak > max_streak ? max_streak = streak : max_streak;
            }
        }
    return max_streak;

    }
};
