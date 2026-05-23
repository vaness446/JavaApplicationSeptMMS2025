import java.util.Scanner;

public class Classwork1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first number:");
		byte  num1 = input.nextByte () ;
		
		
		System.out.print("Enter your second number:");
		byte  num2 = input.nextByte () ;
		
		
		System.out.print("Enter your third number:");
		byte  num3 = input.nextByte () ;
		
		
		System.out.print("Enter your fourth number:");
		byte  num4 = input.nextByte () ;
			
		System.out.print("Enter your fifth number:");
		byte  num5 = input.nextByte () ;
		
		
		int numSum = num1+num2+num3+num4+num5;
		
		int numProduct = num1*num2*num3*num4*num5;
		
		int numAverage = num1+num2+num3+num4+num5 / 5;

		System.out.printf("the sum of the numbers is : %d%n",numSum);
		System.out.printf("the product of the numbers is : %d%n",numProduct);
		System.out.printf("the average of the numbers is : %d%n",numAverage);
		
		
		
		
	}
}			