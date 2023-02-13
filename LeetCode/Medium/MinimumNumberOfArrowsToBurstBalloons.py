class Solution:
    def findMinArrowShots(self, points: List[List[int]]) -> int:
        if not points: return 0
        points.sort(key=lambda x: x[1])
        res, end = 1, points[0][1]
        for i in range(1, len(points)):
            if points[i][0] <= end:
                continue
            res += 1
            end = points[i][1]
        return res
