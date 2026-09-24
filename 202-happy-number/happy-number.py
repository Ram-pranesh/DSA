class Solution:
    def isHappy(self, n: int) -> bool:
        if n==1 or n==7:
            return True
        seen = []
        seen.append(n)
        while True:
            n = sum(int(num)**2 for num in str(n))
            if n == 1 or n == 7:
                return True
            if n in seen:
                return False
            seen.append(n)
        return True
