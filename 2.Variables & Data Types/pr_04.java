/* // Question:- What will be the type of result in the following java code-
byte b = 4;
char c = 'a';
short s = 512;
int i = 1000;
float f = 3.14f;
double d = 99.9954;
result = (f*b) + (i%c) - (d*c);
*/
import java.util.*;
public class pr_04{
    public static void main(String args[]){
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        double result = (f*b) + (i%c) - (d*c);
        System.out.print(result);
    }
}