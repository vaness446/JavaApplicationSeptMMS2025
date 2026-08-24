
package runtime;


public class StringIndexOutOfBoundExceptionHandling {
    public static void main(String[] args){
        try{
        String myName = "Temple Vanessa";
        
        System.out.println(myName.charAt(5));
        }
        catch(  StringIndexOutOfBoundsException g){
            System.out.println("Invalid String index");
            
        }
    }
}
