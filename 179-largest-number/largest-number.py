class Solution:
    def largestNumber(self, nums: List[int]) -> str:
            for i,n in enumerate(nums):
                nums[i] = str(n)
            def cmp(a,b):
                if a+b > b+a:
                    return -1
                else:
                    return 1
            nums.sort(key=cmp_to_key(cmp))
            return str(int("".join(nums)))


