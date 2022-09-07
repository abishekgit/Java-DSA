import java.util.*;

public class pr_03 {
    public static int maxProfit(int prices[]) {
        int maxProfit = 0;
        int buyPrice = prices[0];
        int n = prices.length;

        for (int i = 0; i < n; i++) {
            if (buyPrice < prices[i]) { // profit
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int prices[] = { 7, 6, 4, 3, 1 };
        System.out.println(maxProfit(prices));
    }
}