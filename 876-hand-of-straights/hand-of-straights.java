class Solution {
    public boolean isNStraightHand(int[] nums, int k) {
        if (nums.length % k != 0) return false;
        Map<Integer, Integer> tm = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) tm.put(nums[i],tm.getOrDefault(nums[i],0)+1);

        while (!tm.isEmpty()) {
            int first = tm.keySet().iterator().next();

            for (int i = 0; i < k; i++) {
                int curr = first + i;
                if (!tm.containsKey(curr)) return false;
                int val = tm.get(curr);
                if (val == 1) {
                    tm.remove(curr);
                } else {
                    tm.put(curr,val-1);
                }
            }
        }
        return true;
    }
}