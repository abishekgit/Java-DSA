import java.util.*;
public class tax_calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter you Income in digits:- ");
        int Income = sc.nextInt();
        float Tax;
        if(Income>= 1000000){
        Tax = 0.3f * Income;
        }else if (Income < 1000000 && Income >= 500000){
            Tax = (int) (0.2f * Income);
        }else {
            Tax = 0;
        }System.out.print("Total Tax Payable:- " + Tax);
    }
}