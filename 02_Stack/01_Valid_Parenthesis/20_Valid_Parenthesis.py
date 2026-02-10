class Solution:
    def isValid(self, s: str) -> bool:
        opened = []
        for c in s:
            print("opened:", opened)
            if c == ']':
                if opened and opened[-1] == '[':
                    opened.pop()
                else:
                    return False
            elif c == '}':
                if opened and opened[-1] == '{':
                    opened.pop()
                else:
                    return False
            elif c == ')':
                if opened and opened[-1] == '(':
                    opened.pop()
                else:
                    return False
            else:
                opened.append(c)

        
        return True if not opened else False