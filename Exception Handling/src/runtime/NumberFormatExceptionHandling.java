
package runtime;


public class NumberFormatExceptionHandling {
    public static void main(String[] args){
        try{
        String age = "20";
        
        int myAge = Integer.parseInt(age);
        
        System.out.println("Iam "+ myAge + "Years old");
        }
        catch(NumberFormatException g){
            System.out.println("Enter a valid number");
            System.out.println(g.getMessage());
        }
    }
}
