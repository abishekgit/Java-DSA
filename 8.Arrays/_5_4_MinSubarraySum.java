import java.util.*;

public class _5_4_MinSubarraySum {

    public static void minSubarraySum(int number[]) {

        // outer loop {start}

        int MinSum = Integer.MAX_VALUE;
        int Current_Sum = 0;
        // outer loop
        for (int i = 0; i < number.length; i++) {
            // mid loop ( ending
            for (int j = i; j < number.length; j++) {
                Current_Sum = 0;
                // Sum of subarrays
                for (int k = i; k <= j; k++) {
                    Current_Sum += number[k];
                }
                System.out.println(Current_Sum);
                if (MinSum > Current_Sum) {
                    MinSum = Current_Sum;
                }
            }
        }
        System.out.println("MinSubarraySum is " + MinSum);

    }

    public static void main(String args[]) {
        // array
        int number[] = { 2, 4, 6, 8, 10, 12 };
        minSubarraySum(number);
    }
}
