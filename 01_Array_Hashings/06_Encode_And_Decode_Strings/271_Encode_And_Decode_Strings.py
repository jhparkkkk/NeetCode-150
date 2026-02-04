from typing import List

class Solution:

    def encode(self, strs: List[str]) -> str:
        res = ''
        for s in strs:
            res += str(len(s)) + '#' + s
        return res

    def decode(self, s: str) -> List[str]:
        res = []
        i = 0
        
        while i < len(s):
            s_len = ''
            while s[i] != '#':
                s_len += s[i]
                i += 1
            
            i += 1
            
            length = int(s_len)
            res.append(s[i:i+length])
            
            i += length
            
        return res
