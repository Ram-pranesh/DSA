class Solution { 
    public boolean canReorderDoubled(int[] arr) { 
        Map<Integer, Integer> map = new TreeMap<>((a, b) -> {
            int cmp = Integer.compare(Math.abs(a), Math.abs(b));
            if (cmp != 0) return cmp;
            return Integer.compare(a, b);
        }); 

        for (int i = 0; i < arr.length; i++) { 
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1); 
        } 

        while (map.size() > 0) { 
            if (map.containsKey(0) && map.get(0) % 2 != 0) 
                return false; 

            for (Integer key : new ArrayList<>(map.keySet())) { 
                if (!map.containsKey(key))
                    continue;

                int k = key; 
                int val = map.get(k); 

                if (map.containsKey(2 * k)) { 
                    if (k == 0) { 
                        map.remove(k); 
                    } else { 
                        int count = map.get(k);

                        if (map.get(2 * k) < count)
                            return false;

                        map.remove(k);

                        map.put(2 * k, map.get(2 * k) - count);

                        if (map.get(2 * k) == 0)
                            map.remove(2 * k);
                    } 
                } else { 
                    return false; 
                } 
            } 
        } 

        return true; 
    } 
}