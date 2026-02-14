class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:

        cars = [(pos, speed) for pos, speed in zip(position, speed)]
        cars.sort(reverse=True)
        res = []

        for pos, speed in cars:
            res.append((target - pos) / speed)
            if len(res) >= 2 and res[-1] <= res[-2]:
                res.pop()

        return len(res)