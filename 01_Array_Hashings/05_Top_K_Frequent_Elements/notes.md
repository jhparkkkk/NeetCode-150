#### Intuition

je compte les frequences de chaque int, trie completement et retourne les K int les plus frequents -> O(n log n)

```
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = defaultdict(int)
        for n in nums:
            freq[n] += 1
        test = {k: v for k, v in sorted(freq.items(), key=lambda item: item[1])}
        return list(test.keys())[-k:]

```

#### Bucket Sort

Au lieu de trier les elementss, bucket sort base sur les frequences possibles de 0 a len(nums)

1. compter les frequences de chaque nb
2. creer buckets indexes par frequence
3. iterer sur les ele en decrementant et collecter les K premiers elements.