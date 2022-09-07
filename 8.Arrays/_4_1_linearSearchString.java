public class _4_1_linearSearchString {
    // binary search separate function
    public static int linearSearch(String Menu[], String key) {
        for (int i = 0; i < Menu.length; i++) {
            if (Menu[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        String Menu[] = { "Samosa", "Chai", "Bread Pakoda", "Coke", "Lahori Jeera" };
        String key = "Lahori Jeera";
        int index = linearSearch(Menu, key);
        if (index == -1) {
            System.out.println("Stock out please select something else");
        } else {
            System.out.println(key + " is at index " + index);
        }
    }
}
