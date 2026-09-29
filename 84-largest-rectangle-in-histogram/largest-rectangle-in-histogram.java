class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> stack = new Stack<>();
        int n = heights.length;
        int max = 0;
        for(int i=0; i<n ;i++){
            int st = i;
            while( !stack.isEmpty() && heights[i] < stack.peek()[0] ) {
                int[] val = stack.pop();
                int j = val[1], h = val[0];
                int w = i-j;
                max = Math.max(max, w*h);
                st = j;
            } 
            stack.push(new int[]{heights[i], st});
        }
        while(!stack.isEmpty()){
            int[] val = stack.pop();
            int j = val[1], h = val[0];
            max = Math.max(max, h*(n-j));
        }
        return max;
    }
}