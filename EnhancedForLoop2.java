public class EnhancedForLoop2{
	public static void main(String[] args){
		int[] marks= {12,13,43,2,4,5,6,2,5,2,};
		
		System.out.println("Student Marks are ");
		for(int mark : marks){
			System.out.printf("%d%n",mark);
		}
	}
}