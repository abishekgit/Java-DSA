// Question:- In a program, input 3 numbers A,B,C. You have to output the average of these 3 numbers.

import java.util.*;
public class pr_01{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("The program is to find the Average of 3 Numbers.");
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        System.out.println("Enter Third Number");
        int c = sc.nextInt();
        float Sum = (a + b + c);
        Float Average = Sum/3;
        System.out.println("The Average of Three numbers is ");
        System.out.print(Average);
        }
    }
