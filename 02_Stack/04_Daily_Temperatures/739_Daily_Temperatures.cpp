class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& temperatures) {
        vector<int> res(temperatures.size(), 0);
        stack<int> s;

        for (int i = 0; i < temperatures.size(); i++){
            cout << i;

            while (!s.empty() && temperatures[i] > temperatures[s.top()]){
                cout << "ok";
                int old_day = s.top();
                s.pop();
                res[old_day] = i - old_day; 
            }
            s.push(i);
        }

        return res;
    }
};
