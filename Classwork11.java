import java.util.Scanner;
public class Classwork11{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String [] booktitles ={
			"Harry potter",
			"Dairy of a wimpy kid",
			"A thong of roses ",
			"Married to the devil's son",
			"The son of the house",
			"Atomic Habit",
			"Goose bombs",
			"When our hearts collide",
			"after we collided",
			"The midnight vistor",
			
		};
		
		
        System.out.print("Enter book title: ");
        String search = input.nextLine();
		
		boolean found = false;
	
		for(String book_titles : bookstitles){
			if (book.equals(search)){
				found = true;
			}
		}	
		
		if (found== true){
			System.out.println("book found: "+search);
			else{
				System.out.println("book not found");
		}
    }
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}