class Solution:
    def computeArea(self, A: int, B: int, C: int, D: int, E: int, F: int, G: int, H: int) -> int:
        # Calculate the areas of the two rectangles
        area1 = (C - A) * (D - B)
        area2 = (G - E) * (H - F)
        
        overlap = 0
        left = max(A, E)
        right = min(C, G)
        top = min(D, H)
        bottom = max(B, F)
        if left < right and bottom < top:
            overlap = (right - left) * (top - bottom)
        
        return area1 + area2 - overlap
