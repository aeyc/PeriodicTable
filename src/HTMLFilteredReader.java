import cs1.SimpleURLReader;   
/**  
 * HTMLFilteredReader class to filter HTML code if given url includes, should not show it  
 * @author Ayca Begum Tascioglu  
 * @version 
 */  
public class HTMLFilteredReader extends MySimpleURLReader  
{  
    //constructors  
    /**  
     * HTMLFilteredReader constructs   
     * its superclass-MySimpleURLReader properties  
     */  
    public HTMLFilteredReader( String url )  
    {  
        super(url); //given url                                        
    }  
    
    
    //methods  
    
    /** 
     * getPageContents method overrides superclass 
     * to get page contents but without html code 
     * @return filtered page - page contents with filtered html code 
     */ 
    @Override 
    public String getPageContents() 
    { 
        String filteredPage; 
        filteredPage = ""; 
        boolean controller; 
        controller = true; 
        String tmp = super.getPageContents() ; 
        
        for ( int i = tmp.indexOf( "</table>" ) ; i < tmp.lastIndexOf( "</sup></td>" ) ; i++) 
        { 
            if ( tmp.charAt(i) == '<' )  //if contents begins with that sign 
            { 
                controller = false; 
            } 
            
            else if ( tmp.charAt(i) == '>' && tmp.charAt( i + 1 ) != '<' && i != tmp.length() - 1 ) // exceprt > < 
            { 
                controller = true; 
                i++; 
            } 
            
            if ( controller ) 
            { 
                filteredPage += tmp.charAt(i); 
            } 
            
        } 
        return  filteredPage; 
    }
}