class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        double sum = 0;
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int j = discounts.length - 1;
        for (int i = prices.length - 1; i >= 0; i--) {
            if (j < 0)  sum += prices[i];
            else{
                sum += (double) (prices[i] * (100 - discounts[j])) / 100;
                j--;
            }
        }
        return sum;
    }
}