import java.util.*;

public class oneTOn {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Last number of sequence");
   // input by user 
    int n = sc.nextInt();
    System.out.println("Your input is " + n);
    int Counter = 1;
    while (Counter <= n){
        System.out.print(Counter + " ");
        Counter ++ ;
    }
}
}
