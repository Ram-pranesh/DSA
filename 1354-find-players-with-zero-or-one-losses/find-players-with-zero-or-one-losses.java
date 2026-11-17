class Solution {
     public List<List<Integer>> findWinners(int[][] matches){
        Map<Integer, Integer> loss = new TreeMap<>();
        for(int[] m : matches){
            loss.put(m[0], loss.getOrDefault(m[0], 0));
            loss.put(m[1], loss.getOrDefault(m[1], 0) + 1);
        }
        List<List<Integer>> r = Arrays.asList(new ArrayList<>(), new ArrayList<>());
        for(Integer player : loss.keySet())
            if(loss.get(player) <= 1)
                r.get(loss.get(player)).add(player);
        return r;
    }
}