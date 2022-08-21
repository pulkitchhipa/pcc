class Solution {
    public int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE, max_price = 0;
        for (int price: prices) {
            min_price = Math.min(min_price, price);
            max_price = Math.max(price - min_price, max_price);
        }
        return max_price;
    }
}
