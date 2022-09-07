import java.util.*;
public class pr_01{
public static void average(int a, int b, int c){
    int Average = (a + b + c)/3;
    System.out.print("Average of "+ a+ "," + b +"," + c + " is "+Average);
    return ;
}
public static void main ( String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter three numbers to find their Average \n");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    average(a,b,c);
}
}