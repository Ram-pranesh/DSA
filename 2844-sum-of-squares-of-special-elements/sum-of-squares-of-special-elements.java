class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int total = 0;
        for(int i=1; i<=n; i++){
            if( n % i == 0 ){
                System.out.println(i);
                total += nums[i-1]*nums[i-1];
            }
        }
        return total;
    }
}