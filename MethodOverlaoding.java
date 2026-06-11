import java.util.Scanner;


public class MethodOverlaoding{
	public static void main(String[] args){
		Scanner scan = new Scanner (Syetem.in);
		
		System.out.println("==========calculate perimeter of shapes =========");
		System.out.println("Enter 1. for Square");
		System.out.println("Enter 2. for Rectangle");
		System.out.println("Enter 3. for Triangle");
		System.out.println("Enter 4. Exit program");
		
		System.out.println("Enter your chioce");
		int choice = scan.nextint();
		switch (choice){
		case 1:
		        System.out.print("Enter the lenght of the square");
				int lenofSquare = scan.nextint();
		break;
	
		
		case 2:
		        System.out.print("Enter the lenght of the rectangle");
				int lenoRect = scan.nextint();
				
				
		        System.out.print("Enter the width of the rectangle");
				int lenoRect = scan.nextint();
				
				perimeter(lenoRect,widthofRect);
		break;
		
		case 3:
		System.out.print("Enter sideA: ");
		int sideA = scan.nextint ();
		
		
		System.out.print("Enter sideB: ");
		int sideA = scan.nextint ();
		
		
		System.out.print("Enter sideC: ");
		int sideA = scan.nextint ();
		
		
		perimeter(sideA,sideB,sideC);
		break;
		default:
		            System.out.println("program Exited,Good bye");
		
		
	}
	
	public static void perimeter(int lenofSquare){
		int perimeterOfSquare = 4 * lenofSquare;
		
		System.out.printf("The perimeter of the square is %d%n",perimeterofSquare);
	}
	
	public static void perimeter(int lenofRect, int widthofRect){
		int perimeterofRect = 2 * (lenofRect + widthofRect);
		
		System.out.printf("The perimeter of the Rectangle is %d%n",perimeterofRect);
	}
	
	public static void perimeter(int sideA,int sideB,int sideC){
		int perimeterofTriangle = sideA + sideB  + sideC;
		
		System.out.printf("The perimeter of the triangle is %d%n",perimeteroftriangle);
	}
}