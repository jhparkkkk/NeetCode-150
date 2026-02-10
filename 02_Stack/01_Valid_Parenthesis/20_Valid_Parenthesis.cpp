class Solution {
public:
    bool isValid(string s) {
        
        stack<char> opened = {};
        for (char c : s){

            if (c == ']') {
                if (opened.size() != 0 && (opened.top() == '[')){
                    opened.pop();
                }
                else {return false;}
            }
            else if (c == '}') {
                if (opened.size() != 0 && (opened.top() == '{')){
                    opened.pop();
                }
                else {return false;}
            }
            else if (c == ')') {
                if (opened.size() != 0 && (opened.top() == '(')){
                    opened.pop();
                }
                else {return false;}
            }
            else {
                opened.push(c);
            }
        }

        if (opened.size() == 0) { return true;}
        return false;
    }
};