class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = []
        for i in range(len(nums)):
            pref = 1
            for i_pref in range(0, i):
                pref *= nums[i_pref]
            suff = 1
            for i_suff in range(len(nums)-1, i, -1):
                suff *= nums[i_suff]

            res.append(pref * suff)
                

        
        return res
        