package array;

public class BestTimetoBuyandSellStock {
	public int maxProfit(int[] prices) {
        int min, max;
        if(prices.length < 1) return 0;
        min = prices[0];
        max = prices[prices.length-1];
        int buyday[] = new int[prices.length];
        int sellday[] = new int[prices.length];
        for(int i = 0; i < prices.length; i++){
            min = Math.min(min,prices[i]);
            buyday[i] = min;
        }
        for(int i = prices.length-1; i >= 0; i--){
            max = Math.max(max,prices[i]);
            sellday[i] = max;
        }
        max = 0;
        for(int i = 0; i < prices.length; i++){
            max = Math.max(max, sellday[i] - buyday[i]);
        }
        return max;
    }

}
