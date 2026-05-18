class Solution {
    public int maxProfit(int[] prices) {
        int mprofit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int price : prices){
            minPrice = Math.min(price,minPrice);
            int profit = price - minPrice;
            mprofit = Math.max(profit,mprofit);
        }
        return mprofit;
    }
}
