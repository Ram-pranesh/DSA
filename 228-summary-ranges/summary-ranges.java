class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if(nums.length==1){
            list.add(Integer.toString(nums[0]));
            return list;
        }
        for(int i=0;i<nums.length;i++){
            if(i+1 < nums.length && nums[i]+1 != nums[i+1]) list.add(Integer.toString(nums[i]));
            else{
                int st = nums[i];
                while(i+1<nums.length && nums[i]+1 == nums[i+1]){
                    i++;
                }
                int end = nums[i];
                if(st == end){
                    list.add(Integer.toString(st));
                    continue;
                }
                list.add(st+"->"+end);
            }
        }
        return list;
    }
}