class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        stack<int> s;

        for (string token : tokens){
            if (token == "+"){
                int l = s.top();
                s.pop();
                int r = s.top();
                s.pop();
                s.push(l+r);
            }
            else if (token == "-"){
                int l = s.top();
                s.pop();
                int r = s.top();
                s.pop();
                s.push(r-l);
            }
            else if (token == "*"){
                int l = s.top();
                s.pop();
                int r = s.top();
                s.pop();
                s.push(r*l);
            }
            else if (token == "/"){
                int l = s.top();
                s.pop();
                int r = s.top();
                s.pop();
                s.push(r/l);
            }
            else {
                s.push(stoi(token));
            }
        }
        return s.top();
    }
};