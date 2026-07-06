import java.util.Set;
import java.util.HashSet;


public class UsingSetClass{
	public static void main(String[] args){
		
		Set <String> studentEmails = new HashSet<>();
		
		
		studentEmails.add("templevanessa229@gmail.com");
		studentEmails.add("preciousnweke287@gmail.com");
		studentEmails.add("nessajames837@gmail.com");
		studentEmails.add("templerejoice@gmail.com");
	
	    System.out.println(studentEmails);
		
		
		for(String studentEmail : studentEmails){
			System.out.printf("%s%n",studentEmail);
		
		}
		
	}
	


}	