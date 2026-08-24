
package classwork7;


public class Teacher extends Person {

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    void performDuty() {
        System.out.println("a teacher is teaching");
    }
    
    @Override
    void displayDetails(){
        System.out.println("student name"+name);
        
        System.out.println("student age"+age);
    }
 
}
