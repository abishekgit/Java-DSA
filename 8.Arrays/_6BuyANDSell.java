import java.util.*;

public class _6BuyANDSell { // O(n)
    public static int BuyANDSell(int prices[]) {
        int n = prices.length;
        int buyPrice = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            if (buyPrice < prices[i]) { // profit
                int Profit = prices[i] - buyPrice; // today's profit
                maxProfit = Math.max(Profit, maxProfit);
            } else { // today's price is higher so we'll buy instead of selling
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 5, 1, 3, 2, 11, 4 };
        System.out.println(BuyANDSell(prices));
    }
}