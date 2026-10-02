class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] cnt = new int[n+1];
        Arrays.fill(cnt,0);
        for(int i=0;i<n;i++){
            if(citations[i]>=n) cnt[n]++;
            else cnt[citations[i]]++;
        }
        System.out.println(Arrays.toString(cnt));
        int h = n;
        int paper = cnt[n];
        while(h > paper){
            h-=1;
            paper +=  cnt[h];
        }
        return h;
        
    }
}