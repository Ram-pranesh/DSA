class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        int i=1;
        for(char c: s.toCharArray()){
            //System.out.println('z'-c+" "+" i: "+i);
            ans += ('z'-c+1) * i++;
        }
        return ans;
    }
}