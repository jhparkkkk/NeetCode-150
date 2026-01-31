#### Intuition

bruteforce tester toutes les paires possibles -> 0(n2)

```
for i in range(len(nums)):
    for j in range(i+1, len(nums)):
        if nums[i] + nums[j] == target:
            return [i, j]
```

#### Hash Map (complement lookup)

Chercher le complement de chaque nb dans une struc de donnees -> O(1)

1. pour chaque nb calculer complement
2. verifier si le complement existe deja
    *si* oui retourner idx du complement et idx
    *sinon* ajouter le nb et son idx 

