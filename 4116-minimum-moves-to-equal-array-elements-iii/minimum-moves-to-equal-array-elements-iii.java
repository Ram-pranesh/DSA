class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        int cnt = 0;
        for(int num : nums){
            max = Math.max(max, num);
            cnt += num;
        }
        return nums.length * max - cnt;
    }
}