class Solution {
    public int gcd(int a, int b){
        return (b>0)?gcd(b,a%b):a;
    }
    public boolean hasGroupsSizeX(int[] deck) {
        if(deck.length == 1) return false;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<deck.length;i++) map.put(deck[i],map.getOrDefault(deck[i],0)+1);

        int ans = 0;
        for(int key: map.keySet()) ans = gcd(ans,map.get(key));
        return ans>1;
    }
}