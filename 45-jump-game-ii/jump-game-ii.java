class Solution {
    public int jump(int[] nums) {
        int pos = 0;
        int l = 0, r = 0;
        while(r<nums.length-1){
            int dis = 0;
            for(int i=l;i<r+1;i++){
                dis = Math.max(dis, i+nums[i]);
            }
            l = r+1;
            r = dis;
            pos+=1;
        }
        return pos;
    }
}