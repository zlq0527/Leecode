package Leecode;

public class maxProfit {
	public static void main(String[] args) {
		int[] gp = new int[]{7, 1, 5, 3, 6, 4};
		System.out.println(new maxProfit().maxProfit(gp));
	}

	public int maxProfit(int[] prices) {
		int len = prices.length;
		int maxprofit = 0;
		if (len == 0 || len == 1) {
			return 0;
		}
		for (int i = 0; i < len - 1; i++) {
			if (prices[i] < prices[i + 1]) {
				maxprofit += prices[i + 1] - prices[i];
			}
		}
		return maxprofit;

	}
}
