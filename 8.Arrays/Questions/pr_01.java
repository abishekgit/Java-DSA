public class pr_01 {
    public static boolean duplicate(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) { // remember loop starts from i+1.
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4 };
        System.out.println(duplicate(nums));
    }
}
/*
 * Constraints
 * 1 <= nums.length <= 10^5
 * -10^9 <= nums [ i ] <= 10^9
 */