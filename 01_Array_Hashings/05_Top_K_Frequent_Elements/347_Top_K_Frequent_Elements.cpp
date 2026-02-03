class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        map<int, int> freq;
        for (int n : nums){
            freq[n]++;
        }

        for (const auto& [key, value] : freq){
            std::cout << key << ": " << value << '\n';
        }

        vector<vector<int>> buckets(nums.size() + 1);

        for (const auto& [key, value]: freq) {
            std::cout << "key: " << key << " value: " << value << "\n";
            buckets[value].push_back(key);
            
        }

        vector<int> res;
        for (int i=buckets.size()-1; i > 0; i--){
            std::cout << i;
            for (int n : buckets[i]){
                res.push_back(n);

            }
            if (res.size() == k)
                return res;
        }

        return res;
    }
};
