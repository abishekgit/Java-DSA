import java.util.*;
// It's a fully working Calculator
public class calculator {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the Value of A");
    int A = sc.nextInt();
    System.out.println("Please enter the Value of B");
    int B = sc.nextInt();
    System.out.println("Please enter Operator");
    char Operator = sc.next().charAt(0);

    // Switch operator


    switch(Operator){
        case '+' : System.out.print(A + B);
                    break;
        case '-' : System.out.print(A - B);
                    break;
        case '*' : System.out.print(A * B);
                    break;
        case '/' : System.out.print(A / B);
                    break;
        case '%' : System.out.print(A % B);
                    break;
        default : System.out.println("Error");
    }
}    
}
