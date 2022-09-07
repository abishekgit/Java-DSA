// Question2:Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.
import java.util.*;
public class pr_02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter you body Temperature");
        float Temp = sc.nextFloat();
        String Report = (Temp>100)?"You have a Fever, So have a rest at home today.":"You don't have a fever, So get ready for SCHOOL & Find a better excuse next Time.";
        System.out.println("Your Body temperature says that " + Report);
    }
}
