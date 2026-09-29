class Solution:
    def largestRectangleArea(self, heights: list[int]) -> int:
        n = len(heights)
        stack = []
        max_area = 0
        for i, height in enumerate(heights):
            st = i
            while stack and height < stack[-1][0]:
                h,j = stack.pop()
                width = i-j
                max_area = max(max_area, (h*width))
                st = j
            stack.append((height,st))
        while stack:
            h,j = stack.pop()
            max_area = max(max_area, (h*(n-j)))
        return max_area
