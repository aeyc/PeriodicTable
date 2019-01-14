import java.util.*;
/**
 * __program description___ 
 * @author Ayca Begum Tascioglu
 */ 
public class test
{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner( System.in);
        
        // constants
        
        PeriodicTable t = new PeriodicTable();
        // variables
        
        // program code
        System.out.println( "Start...");
        
        t.set1A();
        t.set2A();
        
        
        System.out.println( t.getGroup1A() ) ;
        System.out.println( t.getDesiredA( 2 , 0) ); 
        System.out.println( "End.");
    }
    
}
