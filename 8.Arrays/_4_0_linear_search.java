import java.util.*;
// Checked Line by line until the desired value is found.

public class _4_0_linear_search {
    public static int linearSearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        // array
        int number[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 24, 36, 48, 60 };
        // value to look for
        int key = 24;
        int index = linearSearch(number, key);
        if (index == -1) {
            System.out.println("NOT found !!");
        } else {
            System.out.println("key is at index " + index);
        }

        System.out.println("length of an array " + number.length);
    }

}
