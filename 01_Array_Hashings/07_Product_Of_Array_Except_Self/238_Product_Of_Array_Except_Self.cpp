class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> res;

        for (int i=0; i<nums.size(); i++){
            cout << nums[i];
            int p = 1;
            for (int p_i=0; p_i<i; p_i++){
                p *= nums[p_i];
            }
            int s =1;
            for (int s_i=nums.size()-1; s_i >i; s_i--){
                s *= nums[s_i];
            }
            res.push_back(p * s);
        }

        return res;
    }
};