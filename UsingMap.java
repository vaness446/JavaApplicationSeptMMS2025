import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UsingMap{
	public static void main(String[] args){
		// create a new Hashmap
		Map<Integer,String>map = new HashMap<>();
		
		
		map.put(101,"Frank John");
		map.put(102,"Henry Clinton");
		map.put(103,"Kate Benson");
		map.put(104,"Lucy Garry");
		map.put(105,"Johnny Victor");
		map.put(106,"Kate Benson");
		map.put(107,"Nathan Zoe");
		
		
		//returning the value associated with the key
		String value  = map.get(102);
		System.out.println("value for 102: " + value);
		
		// removing from a key
		map.remove(106);
		
		boolean hasApple = map.containsKey (106);
		System.out.println ("map contains 106: "+ hasApple);
		
		Set <Integer>keys = map .keySet();
		System.out.println("keys in map: "+ keys);
	}
}