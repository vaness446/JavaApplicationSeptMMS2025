package main;

import java.time.LocalDate;
//import school.Student;
import school.GraduateStudent;
import school.UndergraduateStudent;
import java.util.Scanner;
import school.Student;


public class SchoolManagmentSystemApp {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        
                
        System.out.println("============= menu =================");
        System.out.println("Enter 1: For Graduate Student");
        System.out.println("Enter 2: For UnderGraduate Student");
        System.out.println("Enter 3: To pay School Fees");
        
        System.out.print("======= choose the following options: ===========");
        int choice = scan.nextInt();
        
        switch(choice){
            case 1 ->  {
                System.out.print("Enter your student ID: ");
                int studentID = scan.nextInt();
                scan.nextLine();
                
                System.out.print("Enter First Name: ");
                String firstName = scan.nextLine();
                 scan.nextLine();
                
                System.out.print("Enter Last Name: ");
                String lastName = scan.nextLine();
                
                System.out.print("Enter Gender: ");
                char gender = scan.next().charAt(0);
                scan.nextLine();
                System.out.print("Enter Date Of Birth(YYY-MM-DD): ");
                String dateOfBirth = scan.nextLine();
                
                System.out.print("Enter Phone Number: ");
                String phoneNumber = scan.nextLine();
                
                System.out.print("Enter Final Year Project: ");
                String finalYearProject = scan.nextLine();
                
                GraduateStudent gStudent = 
                        new GraduateStudent(studentID,firstName,lastName,
                        gender, LocalDate.parse(dateOfBirth), 
                                phoneNumber,finalYearProject);
                System.out.println("==============================");
                gStudent.displayStudentInfo();
                    }
            case 2 ->  {
                System.out.print("Enter your student ID: ");
                int studentID = scan.nextInt();
                scan.nextLine();
                
                System.out.print("Enter First Name: ");
                String firstName = scan.nextLine();
                 scan.nextLine();
                
                System.out.print("Enter Last Name: ");
                String lastName = scan.nextLine();
   
           
                System.out.print("Enter Gender: ");
                char gender = scan.next().charAt(0);
                scan.nextLine();
                
                System.out.print("Enter Dirth Of Birth(YYY-MM-DD): ");
                String dateOfBirth = scan.nextLine();
                
                System.out.println("Enter Phone Number: ");
                String phoneNumber = scan.nextLine();
                
                System.out.print("Enter Level: ");
                int level = scan.nextInt();
                
                UndergraduateStudent ugStudent = 
                        new UndergraduateStudent(studentID,firstName,lastName,
                        gender, LocalDate.parse(dateOfBirth), 
                                phoneNumber,level);
                System.out.println("==============================");
                ugStudent.displayStudentInfo();
        break;
        }
            case 3 -> {
                System.out.println("Choose the following option ");
                System.out.println("Enter 1: Amount only");
                System.out.println("Enter 2: Amount, FullName only");
                System.out.println("Enter 3: Amount, FullName,Payment Method only");
                
                System.out.println("====== choose the following options: ===========");
                int myOption = scan.nextInt();
                
                switch(myOption){
                    case 1 -> {
                        System.out.print("Enter StudentID: ");
                        int studentID = scan.nextInt();
                     
                        System.out.print("Enter First Name: ");
                        String firstName = scan.nextLine();
                         scan.nextLine();
                
                        System.out.print("Enter Last Name: ");
                        String lastName = scan.nextLine();
                
                        System.out.print("Enter Gender: ");
                        char gender = scan.next().charAt(0);
                        scan.nextLine();
                        
                        System.out.print("Enter Date Of Birth(YYY-MM-DD): ");
                        String dateOfBirth = scan.nextLine();
                
                        System.out.print("Enter Phone Number: ");
                        String phoneNumber = scan.nextLine();
          
                        
                        Student student = new Student(studentID,firstName,lastName,
                        gender, LocalDate.parse(dateOfBirth), 
                                phoneNumber);
                        
                        System.out.print("Enter amount: ");
                        double amount = scan.nextDouble();
                        
                         System.out.println("==============================");
                        student.payFees(amount);
                        scan.nextLine();
                    }
                    case 2 -> {
                        System.out.print("Enter StudentID: ");
                        int studentID = scan.nextInt();
                     
                        System.out.print("Enter First Name: ");
                        String firstName = scan.nextLine();
                         scan.nextLine();
                
                        System.out.print("Enter Last Name: ");
                        String lastName = scan.nextLine();
                
                        System.out.print("Enter Gender: ");
                        char gender = scan.next().charAt(0);
                        scan.nextLine();
                        
                        System.out.print("Enter Date Of Birth(YYY-MM-DD): ");
                        String dateOfBirth = scan.nextLine();
                
                        System.out.print("Enter Phone Number: ");
                        String phoneNumber = scan.nextLine();
          
                        
                        Student student = new Student(studentID,firstName,lastName,
                        gender, LocalDate.parse(dateOfBirth), 
                                phoneNumber);
                        
                        System.out.print("Enter amount: ");
                        double amount = scan.nextDouble();
                        scan.nextLine();
                        
                        System.out.print("Enter full name: ");
                        String fullName = scan.nextLine();
                        
                         System.out.println("==============================");
                        student.payFees(amount,fullName);
                    }
                    case 3 -> {
                                                System.out.print("Enter StudentID: ");
                        int studentID = scan.nextInt();
                     
                        System.out.print("Enter First Name: ");
                        String firstName = scan.nextLine();
                         scan.nextLine();
                
                        System.out.print("Enter Last Name: ");
                        String lastName = scan.nextLine();
                
                        System.out.print("Enter Gender: ");
                        char gender = scan.next().charAt(0);
                        scan.nextLine();
                        
                        System.out.print("Enter Date Of Birth(YYY-MM-DD): ");
                        String dateOfBirth = scan.nextLine();
                
                        System.out.print("Enter Phone Number: ");
                        String phoneNumber = scan.nextLine();
          
                        
                        Student student = new Student(studentID,firstName,lastName,
                        gender, LocalDate.parse(dateOfBirth), 
                                phoneNumber);
                        
                        System.out.print("Enter amount: ");
                        double amount = scan.nextDouble();
                        scan.nextLine();
                        
                        System.out.print("Enter full name: ");
                        String fullName = scan.nextLine();
                        
                        System.out.print("Enter Payment Method: ");
                        String paymentMethod = scan.nextLine();
                        scan.nextLine();
                        
                        
                         System.out.println("==============================");
                        student.payFees(amount,fullName,paymentMethod);
                    }
                    default -> System.out.println("Invalid Input");
                        
                
                }
                
              break;  
                
            }
            default -> System.out.println("Invalid Input");
        }
    
    }
        
 
    
}