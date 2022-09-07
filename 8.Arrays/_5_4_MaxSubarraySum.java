import java.util.*;

// Calculating Max Sum of Subarrays

// Using BRUTE FORCE

public class _5_4_MaxSubarraySum {
    public static void MaxSubarrySum(int number[]) {
        int Curr_Sum = 0;
        int Max_Sum = Integer.MIN_VALUE;
        // start loop
        for (int i = 0; i < number.length; i++) {
            // defines end value
            for (int j = i; j < number.length; j++) {
                // subarray Sum
                Curr_Sum = 0; // after everyloop its value needs to be re initialized because it will change
                for (int k = i; k <= j; k++) {
                    Curr_Sum += number[k];
                }
                System.out.println(Curr_Sum);
                if (Max_Sum < Curr_Sum) {
                    Max_Sum = Curr_Sum;
                }
            }
        }
        System.out.println("Maximum sum of Array is " + Max_Sum);
    }

    // using PREFIX method

    public static void prefixSumSubarray(int number[]) {
        // start
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        // create a new prefix
        int prefix[] = new int[number.length];
        // value of prefix at 0th index
        prefix[0] = number[0];
        // claculating further values
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }
        // value of prefix further using LOOP
        for (int i = 0; i < prefix.length; i++) {
            // prefix sum
            for (int j = i; j < prefix.length; j++) {
                /*
                 * current sum is equals to ( if i == 0 then prefix [j] else {prefix [j]
                 * - prefix[ i-1] })
                 */
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1]; // current term minus previous term
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum is " + maxSum);
    }

    // Using Kadane's Algorithm

    public static void kadaneSum(int number[]) {
        // if the current Sum becomes negative then update current sum to 0.
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // loop
        for (int i = 0; i < number.length; i++) {
            currSum += number[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max Sum of subarray is " + maxSum);
    }

    public static void main(String args[]) {
        int number[] = { -2, -4, -6, 8 };
        kadaneSum(number);
    }
}