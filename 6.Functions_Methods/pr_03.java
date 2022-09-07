public class pr_03 {
public static int isPalindrome(int n){
    int remainder = 0;
    while(n>0){
    remainder = n%10;
    System.out.print(remainder);
    n = n/10;
}
    if ( n==remainder){
        System.out.println(" entered number is a Palindrome");
    }else {
        System.out.println((" entered number is not a Palindrome"));
    }
    return remainder;
}
public static void main(String args[]){
    int n = 10101;
    isPalindrome(n);
}
}
