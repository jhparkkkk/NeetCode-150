class Solution:
    def isPalindrome(self, s: str) -> bool:
        s =  ''.join(ch for ch in s if ch.isalnum()).lower()

        mid = int(len(s) / 2)
        i = 0
        while i != mid:
            if (s[i] != s[len(s) - 1 - i]):
                return False
            i +=1

        return True