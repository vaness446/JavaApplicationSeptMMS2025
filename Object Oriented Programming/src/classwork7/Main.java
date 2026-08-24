
package classwork7;


public class Main {
    public static void main(String[] args){
        Teacher teacher = new Teacher("john",23);
        
        Student student = new Student("lucy tom",19);
        
        System.out.println("=====Teachers details=====");
        teacher.displayDetails();
        teacher.performDuty();
        
        
        
        
        System.out.println("=====Student details==========");
        student.displayDetails();
        student.performDuty();
    }
}
