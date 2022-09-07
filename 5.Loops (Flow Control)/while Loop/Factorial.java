import java.util.*;
public class Factorial {
public static void main(String args[]){
    
    System.out.print("To Find the Factorial Enter Last Term (Please enter value Less than 21): ");
    Scanner sc = new Scanner(System.in);

    // Using long instead of int is because int can't handle big values. and the result is gonna be very big.
    long Product = 1;
    long n = sc.nextInt();
    int Counter=1;
    while (Counter<=n){
        Product*=Counter;
        Counter++;
    }
    System.out.println(Product);
}   
}
