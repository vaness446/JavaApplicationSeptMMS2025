
package classwork6;

public class TestingPerson {
    public static void main(String[] args){
        System.out.println("==========Student==============");
        Students s1 =  new Students("vanessa",12,"computer science",200);
       
        
        Teachers t1 = new Teachers("chioma",12,"physical",250000);
        
        s1.display();
        t1.display();
        
    }
    
}
