// Question1: Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.*;
public class pr_01 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You can enter either a positive number or a Negative Number the program will tell you whether the number is positive or not");
        System.out.println("Please enter the number");
        int Number = sc.nextInt();
        String Type = (Number>=0)?"Positive":"Negative";
        System.out.println("The number you entered is: " + Type); 
    }
}
