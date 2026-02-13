class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []
        for e in tokens:
            match e:
                case "+":
                    r = stack.pop()
                    l = stack.pop()
                    stack.append(l+r)
                case "*":
                    r = stack.pop()
                    l = stack.pop()
                    stack.append(l*r)
                case "-":
                    r = stack.pop()
                    l = stack.pop()
                    stack.append(l-r)
                case "/":
                    r = stack.pop()
                    l = stack.pop()
                    if l == 0:
                        stack.append(0)
                    else:
                        stack.append(int(l / r))                    
                case _:
                    stack.append(int(e))
        
        return stack[0]