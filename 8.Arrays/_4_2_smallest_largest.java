import java.util.*;

public class _4_2_smallest_largest {
    public static int getLargest(int number[]) {
        // smallest number in integers
        int Smallest = Integer.MAX_VALUE; // + infinity
        int Largest = Integer.MIN_VALUE; // - infinity
        for (int i = 0; i < number.length; i++) {
            if (Largest < number[i]) {
                Largest = number[i];
            }
            if (Smallest > number[i]) {
                Smallest = number[i];
            }
        }
        System.out.println("Smallest value is " + Smallest);
        return Largest;
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 24, 36, 48, 60 };
        int Largest = (getLargest(number));
        System.out.println("largest value is " + Largest);
    }

}