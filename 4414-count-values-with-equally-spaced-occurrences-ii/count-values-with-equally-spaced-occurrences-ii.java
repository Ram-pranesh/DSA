class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer,List<Integer>> map = new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++)
            map.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);
        int cnt = 0;
        for(int key: map.keySet()){
            int len = map.get(key).size();
            if( len>= 3){
                List<Integer> list = map.get(key);
                int diff = list.get(1) - list.get(0);
                int tem = 1;
                for(int i=2;i<len;i++){
                    if(list.get(i) - list.get(i-1) != diff)     break;
                    tem++;                    
                }
                System.out.println(tem+" "+len);
                if(tem == len-1) cnt++;
                
            }
        }
        System.out.println(cnt);
        return cnt;
                
    }
}