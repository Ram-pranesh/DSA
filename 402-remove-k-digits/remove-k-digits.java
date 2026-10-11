class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder st = new StringBuilder();
        for(char ch: num.toCharArray()){
            while( k > 0 && st.length() > 0 && st.charAt(st.length()-1) > ch ){
                st.setLength(st.length()-1);
                k--;
            }
            if(st.length() > 0 || ch!='0')  st.append(ch);

        }
        st.setLength(Math.max(0,st.length()-k));
        return st.length() == 0? "0" :st.toString();
    }
}