
package classwork6;


public class Students extends Persons{
    String course;
    int level;

    public Students(String name, int age,String course,int level) {
        super(name, age);
        this.course = course;
        this.level = level;
       
    }
    
    
    void display(){
        System.out.println("name :"+ name);
        System.out.println("age:"+ age);
        System.out.println("course :"+ course);
        System.out.println("level:" + level);
    
}
}
