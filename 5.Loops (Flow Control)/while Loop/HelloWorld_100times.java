public class HelloWorld_100times{
public static void main(String args[]){
int Count = 0;

// Print Hello World! 10 Lac times

while (Count < 1000000){
    System.out.println("Hello World! " + Count);
    Count++ ;
}
System.out.println("Printed Hello World! " + Count + " times.");
}
}