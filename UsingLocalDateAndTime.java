import java.time.LocalDateTime;

public class UsingLocalDateAndTime{
	public static void main(String[] args){
		LocalDateTime todaysDateTime = LocalDateTime .now();
		System.out.printf("The current date and time is %s%n",todaysDateTime);
		
	}
}