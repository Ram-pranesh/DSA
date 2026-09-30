class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] freq = new int[101];
        for(int n: nums)  freq[n]++;

        List<Integer> list = new ArrayList<>();
        while(true){
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<101;i++){
                if(freq[i] > 0){
                    temp.add(i);
                    freq[i]--;
                }
            }
            list.addAll(temp);
            if(temp.isEmpty()) break;
        }
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}