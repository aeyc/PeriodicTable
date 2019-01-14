import java.util.*;
import java.io.*;
/**
 * Element class to create elements
 * @author: Ayca Begum Tascioglu 
 * @version:
 */
public class Element implements Serializable 
{
    //properties
    private int atomNo;
    private int neutronNo;
    private int valance;
    private HTMLFilteredReader reader;
    private String url;
    
    //constructors
    /**
     * Element constructor to construct the desired element with qualities
     * @param name - element name
     * @param atomNo - proton number of the element
     * @param weight - weight of the protons and neutrons
     */
    public Element( int atomNo, int neutronNo, String url )
    {
        this.atomNo = atomNo;
        this.neutronNo = neutronNo;
        this.url = url;
        reader = new HTMLFilteredReader( url );
        
        if ( atomNo < 3 ) { valance = atomNo; }
        
        if ( atomNo > 2 && atomNo <= 10 ) { valance = atomNo - 2; }
        
        if ( atomNo > 10 && atomNo <= 18 ) { valance = atomNo - 10; }
        
        if ( atomNo > 18 && atomNo <= 36 ) { valance = atomNo - 18; }
        
    }
    
    //methods
    /**
     * getAtomNo method to get proton number of the atom
     * @return atomNo - proton number
     */
    public int getAtomNo()
    {
        return atomNo;
    }
    
    /**
     * getElectronNo method to get electron number of the atom
     * @return atomNo - as a neutral atom's electron number
     */
    public int getElectronNo()
    {
        return getAtomNo();
    }
    
    /**
     * getNeutronNo method to get neutron number of the atom
     * @return neutronNo - as a neutral atom's neutron number
     */
    public int getNeutronNo()
    {
        return neutronNo;
    }
    
    /**
     * getValance method to get an atom's electron numbers in last orbitale
     * @return valance - number of the electrons in last orbitale
     */
    public int getValance()
    {
        return valance;
    }
    
    /**
     * insertInformation method to add all element's to its information from a website
     */
    public void insertInformation()
    {
        System.out.print( reader.getPageContents() );
    }
    
    /**
     * toString method to output properly
     * @return reader.getPageContents - string and filtered page contents
     */
    public String toString()
    {
        return reader.getPageContents() ;
    }
}

