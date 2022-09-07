import java.util.*;
public class ternary_odd_even{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is to check if the number input is odd/even");
        System.out.println("Please input the number");
        int Number = sc.nextInt();
        // TERNARY OPERATOR
        String type = (Number%2 == 0)?"EVEN":"ODD";
        System.out.print(type);
    }
}