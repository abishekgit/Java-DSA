public class _5_1_reverseAnArray {
    public static void reverse(int number[]) {

        // index of starting Value.
        int first = 0;
        int last = number.length - 1;
        while (first < last) {
            int temp = number[first];
            number[first] = number[last];
            number[last] = temp;

            first++;
            last--;
        }
    }

    public static void main(String args[]) {
        // array
        int number[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 24, 36, 48, 60 };

        reverse(number);
        // print reverse
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }
}
