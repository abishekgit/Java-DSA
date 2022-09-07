import java.util.*;
public class largest_of_3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter three numbers: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // if (A>B){
        //     if (A>C){
        //         System.out.print("Greatest of three is "+ A);
        //     }
        //     else{
        //         System.out.print("Greatest of three is "+ C);
        //     }
        // }
        // else{
        //     if(B>C){
        //         System.out.print("Greatest of three is "+ B);
        //     }
        //     else{
        //         System.out.print("Greatest of three is "+ C);
        //     }
        // }
        if ((A>=B) && (A>=C)){
            System.out.print("Greatest of three is: " + A);
        }
        else if ((B>=A) && (B>=C)){
            System.out.print("Greatest of three is: " + B);
        }
        else {
            System.out.print("Greatest of three is: " + C);
        }
    }
}