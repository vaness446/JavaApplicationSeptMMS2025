public class RecusiveMethod{
	public static void main(String[] args){
		displayName();
	}
	public static void displayName(){
		String name = "John Doe";
		System.out.printf("your name is %s%n,name");
		displayName();
		
		
	}
}