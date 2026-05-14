public class OperatorPart1{
	public static void main(String[] args){
		//Assignment Operator(=)
		int num = 200;
		System.out.printf("The value of num is %d%n",num);
		
		System.out.println("");
		System.out.println("=========================");
		
		
		//Arithemetic Operator(+,-,/,*,%)
		int num1 = 80;
		int num2 = 100;
		
		int addition = num1 + num2;
		int subtraction = num1 - num2;
		double division = (double) num1/num2;
		int multiplication = num1 * num2;
		int remainder = num1 % num2;
		
		System.out.println("");
		System.out.println("=========================");
		System.out.printf("the sum of %d  + %d  =%d%n",num1,num2,addition);
		System.out.printf("the sum of %d  - %d  =%d%n",num1,num2,subtraction);
		System.out.printf("the sum of %d  / %d  =%.1f%n",num1,num2,division);
		System.out.printf("the sum of %d  x %d  =%d%n",num1,num2,multiplication);
		System.out.printf("the sum of %d  %% %d  =%d%n",num1,num2,remainder);
		System.out.println("");
		System.out.println("=========================");
		
		// Compund Assignment Operator(+=,-=,*=,/=,%=)
		
		num1 += num2;
		System.out.printf("The value of num1 has been updated to %d%n",num1);
		
		num1 -= num2;
		System.out.printf("The value of num1 has been updated to %d%n",num1);
		
		
	}
}