import java.util.*;
public class ternary_pass_fail{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your marks out of 90");
        int Marks = sc.nextInt();
        String Result = (Marks>=33)?"Pass":"Fail";
        System.out.print(Result);
    }
}