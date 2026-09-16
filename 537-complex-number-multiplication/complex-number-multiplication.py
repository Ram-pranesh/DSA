class Solution:
    def complexNumberMultiply(self, num1: str, num2: str) -> str:
        
        i=0
        for ch in num1:
            i+=1
            if i-1 !=0 and (ch == '+' or ch == '-'):
                a1 = num1[:i-1]
                b1 = num1[i:len(num1)-1]
                break
        i=0
        for ch in num2:
            i+=1
            if  i-1 != 0 and (ch == '+' or ch == '-'):
                a2 = num2[:i-1]
                b2 = num2[i:len(num2)-1]
                print(a2)
                break
        # print(f"a1={a1}, a2={a2}, a3={b1}, a4={b2}")
        real = int(a1)*int(a2) - int(b1)*int(b2)
        comp = int(a1)*int(b2) + int(a2)*int(b1)

        
        s = str(real)
        s+=('+')
        s+=(str(comp))
        s+=('i')
        return s
