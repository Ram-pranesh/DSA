class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        resultant = sorted(nums1 + nums2)
        if len(resultant) % 2 == 1:
            return float(resultant[len(resultant) // 2])
        return (resultant[len(resultant) // 2] + resultant[(len(resultant) // 2) - 1]) / 2.0