public class PrimitiveDataType{
	public static void main(String[] args){
		byte myAge = 30;
		System.out.printf("Miss mercy is %d years old%n",myAge);
		
		short quantity = 20000;
		System.out.printf("The quantity of iphone ordered is %,d%n",quantity);
		
		int nigeriaPopulation = 294848848;
		System.out.printf("The population of Nigeria is  %,d%n",nigeriaPopulation);
		
		long worldPopulation = 28736366378282L;
		System.out.printf("The world's population is %,d%n",worldPopulation);
		
		float price  = 577858.84747F;
		System.out.printf("The price of iphone per unit is %,.2f%n",price);
		
		double myBalance = 3717871837767435.827383;
		System.out.printf("My account balance is %c%,.2f%n",'$',myBalance);
		
		char symbol = '%';
		System.out.printf("There is an increase in the world's popilation by 20.5%c%n",symbol);
		
		boolean isJavaFun = true;
		System.out.printf("Do you love java? %b",isJavaFun);
		
		 
		
		
	}
}