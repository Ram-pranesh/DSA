class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer,List<Integer>> map = new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++)
            map.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);
        int cnt = 0;
        for(int n: map.keySet()){
            if( map.get(n).size() == 3 ){
                List<Integer> list = map.get(n);
                if(list.get(1)-list.get(0) == list.get(2) - list.get(1) ) cnt++;
            }
        }
        System.out.println(cnt);
        return cnt;
    }
}