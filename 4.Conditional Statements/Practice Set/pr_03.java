// Question3: Write a Java program to input week number (1-7) and print day of week name using switch case
import java.util.*;
public class pr_03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which day is it of the week? Let's find out. Enter week number (1-7)");
        int Day = sc.nextInt();
        switch(Day) {
            case 1 : System.out.println("Monday");
                        break;
            case 2 : System.out.println("Tuesday");
                        break;
            case 3 : System.out.print("Wednesday");
                        break;
            case 4 : System.out.print("Thursday");
                        break;
            case 5 : System.out.print("Friday");
                        break;
            case 6 : System.out.print("Saturday");
                        break;
            case 7 : System.out.print("Sunday");
                        break;
            default : System.out.println("Your Input is Invalid. Enter number between(1-7)");
        }
    }
    
}
