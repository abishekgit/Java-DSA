public class _5_2_pairs {
    // important Loop study carefully !!

    public static int pair(int number[]) {
        // outer loop -
        for (int i = 0; i < number.length; i++) {
            //
            for (int j = i + 1; j < number.length; j++) {
                // print statement
                System.out.print("(" + number[i] + "," + number[j] + ")" + ",");
            }
            System.out.println();
        }
        return -1;
    }

    public static void main(String args[]) {
        // array
        int number[] = { 2, 4, 6, 8, 10, 12 };
        int n = number.length;
        pair(number);
        System.out.println("Total number of Pairs :- (n*(n-1))/2 , where n = number of elements.\nIn this case it is "
                + n * (n - 1) / 2);
    }
}
