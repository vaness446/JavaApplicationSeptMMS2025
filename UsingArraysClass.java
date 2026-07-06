import java.util.Arrays;
public class UsingArraysClass{
	public static void main(String[] args){
		int [] numbers = {5,8,2,3,9,4,1,6,7,10};
		int[] a = {7,9,6};
		int[] b = {7,9,6};
		
		int[] c = {7,0,0};
		int[] d = {6,0,0};
		
		
		
		int [] myFillArr = new int [10];
		Arrays.fill(myFillArr,5);
	
		Arrays.sort(numbers);
		System.out.println("The element of the array are");
		
		for (int number : numbers){
			System.out.printf("%d%n",number);
		}
		System.out.println("Binary search");
		int index = Arrays.binarySearch(numbers,9);
		System.out.printf("the index number of 9 is %d%n",index);
		
		boolean isEqual = Arrays.equals(a,b);
		System.out.printf("The result is %b%n",isEqual);
		
		System.out.printf("My fill arrays are");
		for(int number : myFillArr){
			System.out.printf("%d%n",number);
		}
		
		
		int isBigger = Arrays.compare(c,d);
		System.out.printf("The result is %d%n",isBigger);
		
		int [] evenNumbers = {2,4,6,8,10,12,14,16,18,20};
		int [] copyArr = Arrays.copyOf(evenNumbers,10);
		
		System.out.println("The element of the array are");
		for(int arr : copyArr){
			System.out.printf("%d%n",arr);
		}
		
		System.out.println(Arrays.toString(evenNumbers));
		
		
		int [][] multi = {
			{2,3,4,5},
			{2,7,9,0},
		};
		System.out.println(Arrays.deepToString(multi));
		
	}
}
