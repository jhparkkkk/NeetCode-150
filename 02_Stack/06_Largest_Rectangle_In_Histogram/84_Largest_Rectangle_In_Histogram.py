class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        s = [] #(index, height)
        max_area = 0

        for i, h in enumerate(heights):
            start = i
            print(i)
            while s and s[-1][1] > h:
                index, height = s.pop()
                max_area = max(max_area, height * (i - index))
                start = index
            s.append((start, h ))
        
        for i, h in s:
            max_area = max(max_area, h * (len(heights) - i))
        
        
        return max_area