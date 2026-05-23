import java.util.Scanner;

public class Classwork2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		
		
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        boolean isEvenorOdd = (number % 2 == 0);
		System.out.printf(" the number is  even: %b ", isEvenorOdd);
		
	}


}     