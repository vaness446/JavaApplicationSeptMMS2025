import java.util.Scanner;

public class Classwork3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name:");
		String name = input.nextLine () ;
		
		System.out.print("Enter your address:");
		String address = input.nextLine () ;
		
		System.out.print("Enter your age:");
		byte age = input.nextByte();
		
		
		
		
		System.out.println("");
		System.out.printf("Information about %s%n",name);
		System.out.println("************************************");
		
		System.out.printf("Hello %s, You are welcome to my app%n",name);
		System.out.printf("You are %d years old%n",age);
		System.out.printf("You live at %s%n",address);
		
		
		
	}	
}	


