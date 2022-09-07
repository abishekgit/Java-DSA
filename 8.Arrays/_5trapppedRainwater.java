import java.util.*;

public class _5trapppedRainwater {
    public static int trappedWater(int height[]) { // Time Complexity-O(n)
        // height.length = n
        int n = height.length;
        // calculate leftMax boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        // calculate rightMax boundary - array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        // loop
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            // waterlevel = min(leftMax boundary , rightMax boundary)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            // waterTrapped = waterlevel - height[i]
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String args[]) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trappedWater(height));
    }
}
