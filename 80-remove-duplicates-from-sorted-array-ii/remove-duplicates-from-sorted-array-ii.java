class Solution {
    public int removeDuplicates(int[] nums) {
        int len = 0;
        for(int i=0;i<nums.length;){
            if(nums[i] == Integer.MAX_VALUE) continue;
            int temp = nums[i];
            int cnt = 1;
            while(i<nums.length && (temp == nums[i] || nums[i] == 300001)){
                if(cnt>2){
                    nums[i] = 300001;
                }
                cnt++;
                i++;
            }

        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length;i++)  if(nums[i]<300001) len++;
        return len;
    }
}