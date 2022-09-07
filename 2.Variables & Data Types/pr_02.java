// Question:- In a program, input the side of a square. You have to output the area of the square.

import java.util.*;
public class pr_02{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("The program is to get the area of a square with given input");
        System.out.println("Please enter the side of the square");
        int side = sc.nextInt();
        float Area = side * side;
        System.out.println("Area of square is: "+ Area);

} 
}