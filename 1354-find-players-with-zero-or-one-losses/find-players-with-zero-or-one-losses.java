class Solution {
    public List<List<Integer>> findWinners(int[][] mat) {
        int n = mat.length;
        List<List<Integer>> list = new ArrayList<>();
        int max =0 ;
        for(int val[]:mat) max = Math.max(max,Math.max(val[0],val[1]));

        int win[] = new int[max+1];
        int loss[] = new int [max+1];

        for(int i=0;i<n;i++) {
            win[mat[i][0]] ++;
            loss[mat[i][1]] ++;
        }

        list.add(new ArrayList<>());
        list.add(new ArrayList<>());

        for(int i=0;i<max+1;i++) {
            if(win[i] > 0 && loss[i] ==0) list.get(0).add(i);
            if(loss[i] == 1) list.get(1).add(i);
        }
        return list;
    }
}