public class _5_0_binarySearch {

    // Works on the principle of dictionary
    // Divide the Array into half and then look for the desired value..
    public static int binarySearch(int number[], int key) {
        int start = 0;
        int end = number.length - 1;
        while (start <= end) {
            // creating mid value

            int mid = (start + end) / 2;

            // Comparison
            /* Don't forget to follow the format :- number[mid] */
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) { // right
                start = mid + 1;
            } else {
                end = mid - 1; // left
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int number[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 24, 36, 48, 60 };
        int key = 12;
        // Printing the function
        System.out.println("index for key is " + binarySearch(number, key));
    }
}
