import java.util.*;

public class _3input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int Marks[] = new int[10];

        // Length of an Array can be find out using arrayName.length -- but first import
        // use java util

        System.out.println("length of array " + Marks.length);

        // INPUT of Arrays
        Marks[0] = sc.nextInt(); // Physics
        Marks[1] = sc.nextInt(); // Chemistry
        Marks[2] = sc.nextInt(); // Maths
        Marks[3] = sc.nextInt(); // English
        Marks[4] = sc.nextInt(); // Physical Education

        // taking Output from Arrays
        System.out.println("Physics marks " + Marks[0]);
        System.out.println("Chemistry Marks " + Marks[1]);
        System.out.println("Math marks " + Marks[2]);
        System.out.println("English Marks " + Marks[3]);
        System.out.println("Physical Marks " + Marks[4]);

        // ALSO TRUE
        // Updating or Modifying the values of the data.
        /* Marks[4] = Marks[4] + 5; // one way */

        Marks[3] = 100; // Another Way
        System.out.println("updated marks in English " + Marks[3]);

        // Mathematical formulas can also be applied on Arrays such as finding
        // percentage and other stuff.

        int Total_Score = (Marks[0] + Marks[1] + Marks[2] + Marks[3] + Marks[4]);
        int percentage = (Marks[0] + Marks[1] + Marks[2] + Marks[3] + Marks[4]) / 4;
        System.out.println("Total marks = " + Total_Score);
        System.out.println("Total percentage obtained = " + percentage + "%");
    }
}