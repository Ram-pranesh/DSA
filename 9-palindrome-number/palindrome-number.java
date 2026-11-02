class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int rem=0,temp=x;
        while(x>0){
            rem = rem*10 + x%10;
            x/=10;
        }
        x=temp;
        System.out.println( rem );
        if(rem==x) return true;
        return false;
    }
}