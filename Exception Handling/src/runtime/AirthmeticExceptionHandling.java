
package runtime;
import java.util.Scanner;


public class AirthmeticExceptionHandling {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
try{
System.out.println("Dividing the first number bu secong number");
System.out.print("Enter first number:");

int num1 = scan.nextInt();


System.out.print("Enter second number:");
int num2 = scan.nextInt();


int division  = num1/num2;

System.out.printf("The result is %d%n",division);
}
catch(ArithmeticException e){
    System.out.println("Number can not be divided by zero");
}
finally{
    System.out.println("This part of code will always run");
}

    }
}
