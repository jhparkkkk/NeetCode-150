class Solution {
public:
    int carFleet(int target, vector<int>& position, vector<int>& speed) {

        stack<double> res;

        vector<pair<int, int>> cars;
        for (int i = 0; i < position.size(); i++){
            cars.push_back({position[i], speed[i]});
        }

        sort(cars.rbegin(), cars.rend());


        for (int i=0; i<cars.size(); i++){
            double time = double(target - cars[i].first) / cars[i].second;
            res.push(time);
            cout << time;
            if (res.size() >= 2){
                double current_car = res.top();
                res.pop();
                double prev_car = res.top();
                if (current_car > prev_car){
                    res.push(current_car);
                }
            }
        }

        return res.size();

    }
};
