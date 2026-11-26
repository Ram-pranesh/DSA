class Solution {
    public boolean canAliceWin(int n) {
        int rem = 10;
        boolean sol = true;
        while (n >= rem) {
            n -= rem;
            rem--;
            sol = !sol;
        }
        return !sol;
    }
}