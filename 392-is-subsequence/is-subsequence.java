class Solution {
    public boolean isSubsequence(String s, String t) {
        int id = 0;
        if(s.length() == 0) return true;
        for(int i=0; i<t.length() && id<s.length() ;i++){
            if(t.charAt(i) == s.charAt(id)) id++;
        }
        return id == s.length();
    }
}