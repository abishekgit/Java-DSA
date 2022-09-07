// This is the program to write the SUM of first n Natural Numbers from 1 to n (where n is the input given by the user.)

// import java.util.*;
// public class oneTOnSUM {
// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Sum of fist n Natural Number");
//     System.out.println("Enter the last term of Sequence");
//     int n = sc.nextInt();
//     int First_term = 1;
//     while (First_term <= n){
//         // System.out.print(First_term + " ");
//         First_term++;
//     }
//     System.out.println("Sum of First n Natural numbers is " + (n*(n+1))/2);
// }
// }


// Another Method is

import java.util.*;
public class oneTOnSUM {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Sum of fist n Natural Number");
    System.out.println("Enter the last term of Sequence");
    int n = sc.nextInt();
    int First_term = 1;
    int Sum = 0;
    while (First_term <= n){
        // System.out.print(First_term + " ");
        Sum+=First_term;
        First_term++;
    }
    System.out.println("Sum of First n Natural numbers is " + Sum);
}
}