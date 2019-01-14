import cs1.SimpleURLReader;  
import java.util.*; 
 
/** 
 * MySimpleURLReader class which extends super class-SimpleURLReader  
 * new methods to get url and create an object as SimpleURLReader and get file name  
 * also override getpage method to add new implementations 
 * @author Ayca Begum Tascioglu 
 * @version 
 */ 
public class MySimpleURLReader extends SimpleURLReader  
{     
  //properties 
  protected String url; 
   
  //constructors 
  /** 
   * MySimpleURLReader constructor extends its super class SimpleURLReader 
   * initilize url as empty string 
   */ 
  public MySimpleURLReader( String url) 
  { 
    super( url ); 
    this.url = url; 
  } 
   
  //methods 
  /** 
   * getURL method to get a string to create a new simpleurl 
   * @return tmp to used string to create url 
   */ 
  public String getURL() 
  { 
    return url; 
  } 
   
  /** 
   * getName method to get file name in desired url 
   * @return url.substring( url.lastIndexOf('/') )  -  the file name which starts after the last '/' 
   */ 
  public String getName() 
  { 
    return url.substring( url.lastIndexOf('/') ) ; 
  } 
   
  //overriding 
  /** 
   * getPageContents method which overrides super class 
   * @return " " - empty string if page includes null 
   * @return tmp - the super classes's page contents if it's not null 
   */ 
  @Override 
  public String getPageContents() 
  { 
    String tmp = super.getPageContents(); 
    tmp = tmp.substring( 4 ); 
    return tmp; 
  } 
} 
