class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        nums_set = set(nums)

        streak_max = 0
        for n in nums:
            if n - 1 not in nums_set:
                print(f" {n} is the first ele of sequence")
                streak = 1
                while n+1 in nums_set:
                    n += 1
                    streak += 1
                if streak > streak_max: 
                    streak_max = streak
        
        return streak_max  