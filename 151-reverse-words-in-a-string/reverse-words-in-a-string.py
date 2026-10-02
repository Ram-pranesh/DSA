class Solution:
    def reverseWords(self, s: str) -> str:
        s = s.strip()
        arr = s.split(" ")
        arr = arr[::-1]
        print(arr)
        sr = ""
        for c in arr:
            if c == "":
                continue
            sr+=c
            sr+=" "
        return sr[:len(sr)-1]