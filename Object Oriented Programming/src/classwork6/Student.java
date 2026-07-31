
package classwork6;


public class Student extends Person{
   private String course;

    public Student(String name, int age) {
        super(name, age);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
   @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("course");
    }
   
   
   }