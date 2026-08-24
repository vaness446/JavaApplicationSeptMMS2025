
package classwork7;

public class Student extends Person{

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    void performDuty() {
        System.out.println("the Student duty is to study");
    }    
    
    @Override
    void displayDetails(){
        System.out.println("student name"+name);
        
        System.out.println("student age"+age);
    }
}
