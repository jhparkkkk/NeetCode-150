class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        res = [0] * len(temperatures)
        stack = []


        for i, temp in enumerate(temperatures):
            print(i, temp)
            while stack and temp > temperatures[stack[-1]]:
                old_day = stack.pop()
                res[old_day] = i - old_day
            stack.append(i)

        
        return res