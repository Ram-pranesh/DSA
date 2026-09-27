class Solution {
    public boolean isSubsequence(String s, String t) {
        int id = 0,j=0;
        if(s.length() == 0) return true;

        while( id<s.length() && j<t.length() ){
            if(s.charAt(id) == t.charAt(j)) id++;
            j++;
        }
        return id == s.length();
    }
}