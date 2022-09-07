//Question:-  Enter the cost of 3 items from the user (using float data type) - a pencil, a pen, and an eraser. you have to output the total cost of the items back to the user as their bill.(Add on :- You can also try padding 18% GST to the items in the bill as an advanced problem.)

import java.util.*;
public class pr_03{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to get the bill of items purchased");

        System.out.println("The cost of a pencil is: ");
        float Pencil = sc.nextFloat();

        System.out.println("The cost of a Pen is: ");
        float Pen = sc.nextFloat();

        System.out.println("The cost of an Eraser is-- ");
        float Eraser = sc.nextFloat();
        
        float Total = (Pencil) + (Pen) + (Eraser);

    // Total with 18% GST included

        float GST = 0.18f * (Total);
        float Final_Amount = (Total) + (GST);

        System.out.println("Sum is:- ");
        System.out.println(Total);
        
        System.out.println("18% GST is:- ");
        System.out.println(GST);
        
        System.out.println("The total amount to be paid:- ");
        System.out.println(Final_Amount);
    }


}