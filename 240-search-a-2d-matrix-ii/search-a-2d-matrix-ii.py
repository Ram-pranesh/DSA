class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        arr = [x for r in matrix for x in r]
        arr.sort()
        print(arr)
        lo = 0
        hi = len(arr)-1
        while lo <= hi:
            mid = lo + (hi-lo)//2
            if arr[mid] == target:
                return True
            elif arr[mid] < target:
                lo = mid+1
            else:
                hi = mid-1
        return False