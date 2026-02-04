class Solution {
public:

    string encode(vector<string>& strs) {

        string res = "";

        for (string s : strs){
            res.append(to_string(s.length()) +"#"+s);
        }
        cout << res;

        return res;

    }

    vector<string> decode(string s) {
        vector<string> res = {};
        int i = 0;
        while (i < s.length()){
            string s_len = "";

            while(s[i] != '#'){
                s_len += s[i];
                i++;
            }
            i++;
            int len = stoi(s_len);
            res.push_back(s.substr(i, len));
            i += len;
        }

        return res;
    }
};