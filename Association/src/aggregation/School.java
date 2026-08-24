
package aggregation;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Student> student;
    
    public School(String schoolName, List student){
        this.schoolName = schoolName;
        this.student = student;
    }
    
    public void displayStudentDetails(){
        System.out.println();
        System.out.println("        SCHOOL INFORMATION");
        System.out.println("==============================");
        System.out.println("schoolName: "+ schoolName);
        System.out.println("number of students: "+ student.size());
        
        for(Student  students: student){
            students.displayStudentDetails();
        }        
    }
    
}
