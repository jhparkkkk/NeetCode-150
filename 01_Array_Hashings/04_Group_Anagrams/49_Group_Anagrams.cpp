class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> res;

        for (string s: strs) {
            int arr[26] = {};
            for (char c: s) {
                arr[int(c) - int('a')] += 1;
            }
            string key;
            for (int v : arr){
                key += to_string(v) + '#';
            }
            res[key].push_back(s);
        };

        vector<vector<string>> result;
        for (auto& pair : res){
            result.push_back(pair.second);
        };

        return result;
    }
};