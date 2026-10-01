class Solution {
    public boolean canJump(int[] nums) {
        int pos = 0;
        if(nums[0] == 0 && nums.length == 1)return true;
        if(nums[0] == 0 && nums.length > 1)return false;
        for(int i=0;i<nums.length-1;i++){
            if(pos >= nums.length-1) return true;
            if(pos == i && nums[i]==0) return false;
            pos = Math.max(pos, i+nums[i]);
        }
        System.out.print(pos);
        return true;
    }
}