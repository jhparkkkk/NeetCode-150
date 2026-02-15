class Solution {
public:
    int largestRectangleArea(vector<int>& heights) {
        stack<pair<int, int>> s;

        int max_area = 0;

        for (int i=0; i<heights.size(); i++){
            int start = i;
            
            while (!s.empty() && s.top().second > heights[i]){
                int index = s.top().first;
                int height = s.top().second;
                s.pop();
                max_area = max(max_area, height * (i - index));
                start = index;
            }

            s.push({start, heights[i]});
        }

        while (!s.empty()){
            int index = s.top().first;
            int height = s.top().second;
            s.pop();
            max_area = max(max_area, height * (int)(heights.size() - index));
        }

        return max_area;
    }
};
