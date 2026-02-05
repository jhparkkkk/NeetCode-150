#### Intuition

brute force pour chaque idx je multiplie tous les elements sauf nums[idx]

probleme : O(n2)

```
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = []
        for i in range(len(nums)):
            test = 1
            for j in range(len(nums)):
                if i != j:
                    test *= nums[j]
            res.append(test)
        return res
        
```

#### prefix/suffix product

Pour chaque position i, le produit de  tous les elements sont 

pdt de tous les ele a gauche * pdt de tous les ele a droite