
package aggregation;

import composition.Payment;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class SchoolManagementSystem {
    public static void main(String[] args){
      
        // student objects created
        Student s1  = new Student(101,"Henry","John",'M');
        Student s2  = new Student(102,"jOY","JAKE",'F');
        Student s3  = new Student(103,"BEN","John",'M');
        Student s4  = new Student(104,"MADDIE","John",'F');
        Student s5  = new Student(106,"GRACE","John",'F');
        
         
        s1.makePayment(3000000, LocalDate.of(2026,8,10), "transfer", "paid for Data Analytics");
        s3.makePayment(2000000, LocalDate.of(2026,8,10), "pos", "paid for java");
        s5.makePayment(5000000, LocalDate.of(2026,8,10), "transfer", "paid for mms");
        
        // school objects created
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        
        
        
        School school = new School("Green Land International School",students);
        
        school.displayStudentDetails();
        
        
    }
    
}
