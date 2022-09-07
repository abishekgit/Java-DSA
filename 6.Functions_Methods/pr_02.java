import java.util.*;
public class pr_02 {
public static void isEven (int n){
    if (n%2 == 0){
        System.out.println(n + " is Even");
    }else {
        System.out.println(n + " is not Even");
    }
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the number to check if it is a Even Number");
    int n = sc.nextInt();
    isEven(n);
}
}
