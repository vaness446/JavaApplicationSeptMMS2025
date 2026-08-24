
package chapter14;

 import java.util.Scanner;
public class PrintingDatesinVariousFormats {
   
public class Ex1419 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter date (MM/DD/YYYY): ");
        String date = input.nextLine();
        String[] parts = date.split("/");
        int month = Integer.parseInt(parts[0]);
        String day = parts[1];
        String year = parts[2];
        String[] months = {
            "", "January", "February", "March", "April",
            "May", "June", "July", "August", "September",
            "October", "November", "December"
        };
        System.out.println(months[month] + " " + day + ", " + year);
}
    }
}
