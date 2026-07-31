import java.util.Scanner;

public class ClassworkSalary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = input.nextLine();

        System.out.print("Enter Hours Worked: ");
        int hours = input.nextInt();

        System.out.print("Enter Hourly Rate: ");
        double rate = input.nextDouble();

        double grossSalary = hours * rate;
        double tax = grossSalary * 10 / 100;
        double netSalary = grossSalary - tax;
		
		
		
        System.out.println("##################");
        System.out.println("Employee Name: "+name);
        System.out.println("Gross Salary: " +grossSalary);
        System.out.println("Tax: "+ tax);
        System.out.println("Net Salary: " +netSalary);
		System.out.println("###################");
    }
}