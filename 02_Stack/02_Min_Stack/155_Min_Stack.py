class MinStack:
    stack = []
    min_stack = []
    def __init__(self):
        self.stack = self.stack.clear()
        self.stack = []
        self.min_stack = self.min_stack.clear()
        self.min_stack = []
        

    def push(self, val: int) -> None:
        self.stack.append(val)
        if not len(self.min_stack) or val <= self.min_stack[-1]:
            self.min_stack.append(val)
        else:
            self.min_stack.append(self.min_stack[-1])
        return None

    def pop(self) -> None:
        self.stack.pop()
        self.min_stack.pop()
        return None

    def top(self) -> int:
        return self.stack[-1]

    def getMin(self) -> int:
        return self.min_stack[-1]
        