class Solution {
public:
    bool isPalindrome(string s) {

        string cleaned_s;

        for (char c: s) {
            if (isalnum(c)){
                cleaned_s += tolower(c);
            }
        }

        int mid = cleaned_s.size() / 2;
        
        int i = 0;
        while (i < mid){
            if (cleaned_s[i] != cleaned_s[cleaned_s.size() - 1 - i]){
                return false;
            }
            i++;
        }

        return true;
        
    }
};
