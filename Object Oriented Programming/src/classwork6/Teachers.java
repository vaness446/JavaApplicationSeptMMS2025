
package classwork6;

public class Teachers extends Persons {
    String department;
    int salary;

    public Teachers(String name, int age,String department,int salary) {
        super(name, age);
        this.department = department;
        this.salary = salary;
        
    }
        
    void display(){
                System.out.println("==========Teacher==============");

        
        System.out.println("name :"+ name);
        System.out.println("age:"+ age);
        System.out.println("department :"+ department);
        System.out.println("salary:" + salary);
    
}
    
}
