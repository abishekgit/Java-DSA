import java.util.*;

public class _5_3_subarrays {

    public static int subarrays(int number[]) {
        int tp = 0; // to find total number of pairs
        // defines starting point
        for (int i = 0; i < number.length; i++) {
            // defines ending point
            for (int j = i; j < number.length; j++) {
                // print {start to end all numbers} ---
                for (int k = i; k <= j; k++) {
                    System.out.print(number[k] + " ");
                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("Total Subarrays are " + tp);
        return -1;
    }

    public static void main(String args[]) {
        // array
        int number[] = { 2, 4, 6, 8, 10, 12 };
        subarrays(number);
    }
}
