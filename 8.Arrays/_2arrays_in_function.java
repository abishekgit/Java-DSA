
// Arrays are often embedded in a function most of the times to perform a loop.
// 
import java.util.*;

// new separate function
public class _2arrays_in_function {

    // update our marks
    public static void update(int Marks[]) {
        for (int i = 0; i < Marks.length; i++) {
            Marks[i] = Marks[i] + 1;
        }
    }
    // Main function

    public static void main(String args[]) {
        int Marks[] = { 97, 98, 99 };
        update(Marks);

        // print out marks
        for (int i = 0; i < Marks.length; i++) {
            System.out.print(Marks[i] + " ");
        }
        System.out.println();
    }
}