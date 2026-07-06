import java.util.List;
import java.util.ArrayList;

public class UsingList{
	public static void main(String[] args){
		List<String> cars = new ArrayList<>();
		
		cars.add("Toyota");
		cars.add("BMW");
		cars.add("Mercedes Benz");
		cars.add("Rolls Royce");
		cars.add(1, "Ford");
		
		// set the value of an element
		cars.set(1,"Dodge");
		
		// removing element from the list
		cars.remove(0);
		System.out.printf("car size: %d%n%n",cars.size());
		
		// get element using the indexing
		
		System.out.printf("%s%n",cars.get(1));
		
		
	
		for(String car : cars){
			System.out.println(car);
	    }
		
		
	}
}