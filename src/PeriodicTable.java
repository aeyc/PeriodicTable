import java.util.*;
/**
 * PeriodicTable class to set a molecule
 * @author: Ayca Begum Tascioglu
 * @version:
 */
public class PeriodicTable
{
    // properties
    ArrayList<Element> a1;
    ArrayList<Element> a2;
    ArrayList<Element> a3;
    ArrayList<Element> a4;
    ArrayList<Element> a5;
    ArrayList<Element> a6;
    ArrayList<Element> a7;
    ArrayList<Element> a8;
    ArrayList<Element> b3;
    ArrayList<Element> b4;
    ArrayList<Element> b5;
    ArrayList<Element> b6;
    ArrayList<Element> b7;
    ArrayList<Element> b81;
    ArrayList<Element> b82;
    ArrayList<Element> b83;
    ArrayList<Element> b1;
    ArrayList<Element> b2;
    
    //constructors
    /**
     * PeriodicTable constructs all of the periodic table's groups
     */
    public PeriodicTable()
    {
        a1 = new ArrayList<>();
        a2 = new ArrayList<>();
        a3 = new ArrayList<>();
        a4 = new ArrayList<>();
        a5 = new ArrayList<>();
        a6 = new ArrayList<>();
        a7 = new ArrayList<>();
        a8 = new ArrayList<>();
        b3 = new ArrayList<>();
        b4 = new ArrayList<>();
        b5 = new ArrayList<>();
        b6 = new ArrayList<>();
        b7 = new ArrayList<>();
        b81 = new ArrayList<>();
        b82 = new ArrayList<>();
        b83 = new ArrayList<>();
        b1 = new ArrayList<>();
        b2 = new ArrayList<>();
    }
    
    //methods
    //----------------------------------------- A GROUP SETTERS -----------------------------------------------------------
    /**
     * set1A group to set periodic table's 1A group
     * adds all of the 1A elements into the a1 arraylist
     */
    void set1A()
    {
        Element hydrogen = new Element( 1, 0, "http://periodic.lanl.gov/1.shtml" );
        Element lithium = new Element( 3, 4, "http://periodic.lanl.gov/3.shtml" );
        Element sodium = new Element( 11, 12, "http://periodic.lanl.gov/11.shtml" );
        Element potassium = new Element( 19, 20, "http://periodic.lanl.gov/19.shtml" );
        Element rubidium = new Element( 37, 48, "http://periodic.lanl.gov/37.shtml" );
        Element cesium = new Element( 55, 78, "http://periodic.lanl.gov/55.shtml" );
        Element francium = new Element( 87, 136, "http://periodic.lanl.gov/87.shtml" );
        a1.add( hydrogen );
        a1.add( lithium );
        a1.add( sodium );
        a1.add( potassium );
        a1.add( rubidium );
        a1.add( cesium );
        a1.add( francium );
    }
    
    /**
     * set2A group to set periodic table's 2A group
     * adds all of the 2A elements into the a2 arraylist
     */
    void set2A()
    {
        Element beryllium = new Element( 4, 5, "http://periodic.lanl.gov/4.shtml" );
        Element magnesium = new Element( 12, 12, "http://periodic.lanl.gov/12.shtml" );
        Element calcium = new Element( 20, 20, "http://periodic.lanl.gov/20.shtml" );
        Element strontium = new Element( 38, 50, "http://periodic.lanl.gov/38.shtml" );
        Element barium = new Element( 56, 81, "http://periodic.lanl.gov/56.shtml" );
        Element radium = new Element( 88, 138, "http://periodic.lanl.gov/88.shtml" );
        a2.add( beryllium );
        a2.add( magnesium );
        a2.add( calcium );
        a2.add( strontium );
        a2.add( barium );
        a2.add( radium );
    }
    
    /**
     * set3A group to set periodic table's 3A group
     * adds all of the 3A elements into the a3 arraylist
     */
    void set3A()
    {
        Element boron = new Element( 5, 6, "http://periodic.lanl.gov/5.shtml" );
        Element aluminum = new Element( 13, 14, "http://periodic.lanl.gov/13.shtml" );
        Element gallium = new Element( 31, 39, "http://periodic.lanl.gov/31.shtml" );
        Element indium = new Element( 49, 66, "http://periodic.lanl.gov/49.shtml" );
        Element thallium = new Element( 81, 123, "http://periodic.lanl.gov/81.shtml" );
        Element nihonium = new Element( 113, 167,"http://periodic.lanl.gov/113.shtml" );
        a3.add( boron);
        a3.add( aluminum);
        a3.add( gallium );
        a3.add( indium );
        a3.add( thallium );
        a3.add( nihonium );
    }
    
    /**
     * set4A group to set periodic table's 4A group
     * adds all of the 4A elements into the a4 arraylist
     */
    void set4A()
    {
        Element carbon = new Element( 6, 6, "http://periodic.lanl.gov/6.shtml" );
        Element silicon = new Element( 14, 14,"http://periodic.lanl.gov/14.shtml" );
        Element germanium = new Element( 32, 41, "http://periodic.lanl.gov/32.shtml" );
        Element tin = new Element( 50, 69, "http://periodic.lanl.gov/50.shtml" );
        Element lead = new Element( 82, 125, "http://periodic.lanl.gov/82.shtml" );
        Element flerovium = new Element( 114, 169, "http://periodic.lanl.gov/114.shtml" );
        a4.add( carbon );
        a4.add( silicon );
        a4.add( germanium );
        a4.add( tin );
        a4.add( lead );
        a4.add( flerovium );
    }
    
    
    /**
     * set5A group to set periodic table's 5A group
     * adds all of the 5A elements into the a5 arraylist
     */
    void set5A()
    {
        Element nitrogen = new Element( 7, 7, "http://periodic.lanl.gov/7.shtml" );
        Element phosphorous = new Element( 15, 16, "http://periodic.lanl.gov/15.shtml" );
        Element arsenic = new Element( 33, 42, "http://periodic.lanl.gov/33.shtml" );
        Element antimony = new Element( 51, 71, "http://periodic.lanl.gov/51.shtml" );
        Element bismuth = new Element( 83, 126, "http://periodic.lanl.gov/83.shtml" );
        Element moscovium = new Element( 115, 171, "http://periodic.lanl.gov/115.shtml" );
        a5.add( nitrogen );
        a5.add( phosphorous );
        a5.add( arsenic );
        a5.add( antimony );
        a5.add( bismuth );
        a5.add( moscovium );
    }
    
    /**
     * set6A group to set periodic table's 6A group
     * adds all of the 6A elements into the a6 arraylist
     */
    void set6A()
    {
        Element oxygen = new Element( 8, 8, "http://periodic.lanl.gov/8.shtml" );
        Element sulfur = new Element( 16, 16, "http://periodic.lanl.gov/16.shtml" );
        Element selenium = new Element( 34, 45, "http://periodic.lanl.gov/34.shtml" );
        Element tellurium = new Element( 52, 76, "http://periodic.lanl.gov/51.shtml" );
        Element polonium = new Element( 84, 125, "http://periodic.lanl.gov/83.shtml" );
        Element livermorium = new Element( 116, 175, "http://periodic.lanl.gov/116.shtml" );
        a6.add( oxygen );
        a6.add( sulfur );
        a6.add( selenium );
        a6.add( tellurium );
        a6.add( polonium );
        a6.add( livermorium );
    }
    
    /**
     * set7A group to set periodic table's 7A group
     * adds all of the 7A elements into the a7 arraylist
     */
    void set7A()
    {
        Element florine = new Element( 9, 10, "http://periodic.lanl.gov/9.shtml" );
        Element chlorine = new Element( 17, 18, "http://periodic.lanl.gov/17.shtml" );
        Element bromine = new Element( 35, 45, "http://periodic.lanl.gov/35.shtml" );
        Element iodine = new Element( 53, 74, "http://periodic.lanl.gov/53.shtml" );
        Element astatine = new Element( 85, 125, "http://periodic.lanl.gov/85.shtml" );
        Element tennessine = new Element( 117,  165, "http://periodic.lanl.gov/117.shtml" );
        a7.add( florine );
        a7.add( chlorine );
        a7.add( bromine );
        a7.add( iodine );
        a7.add( astatine );
        a7.add( tennessine );
    }
    
    /**
     * set8A group to set periodic table's 8A group
     * adds all of the 8A elements into the a8 arraylist
     */
    void set8A()
    {
        Element helium = new Element( 2, 2, "http://periodic.lanl.gov/2.shtml" );
        Element neon = new Element( 10, 10, "http://periodic.lanl.gov/10.shtml" );
        Element argon = new Element( 18, 22, "http://periodic.lanl.gov/18.shtml" );
        Element krypton = new Element( 36, 48, "http://periodic.lanl.gov/36.shtml" );
        Element xenon = new Element( 54, 77, "http://periodic.lanl.gov/54.shtml" );
        Element radon = new Element( 86, 136, "http://periodic.lanl.gov/86.shtml" );
        Element oganesson = new Element( 118, 167, "http://periodic.lanl.gov/118.shtml" );
        a8.add( helium );
        a8.add( neon );
        a8.add( argon );
        a8.add( krypton );
        a8.add( xenon );
        a8.add( radon );
        a8.add( oganesson );
    }
    
    //------------------------------------------- B GROUP SETTERS ---------------------------------------------------------
    /**
     * set3B group to set periodic table's 3B group
     * adds all of the 3B elements into the 3B arraylist
     */
    void set3B()
    {
        Element scandium = new Element( 21, 24, "http://periodic.lanl.gov/21.shtml" );
        Element yttrium = new Element( 39, 50, "http://periodic.lanl.gov/39.shtml" );
        b3.add( scandium );
        b3.add( yttrium );
    }
    
    /**
     * set4B group to set periodic table's 4B group
     * adds all of the 4B elements into the b4 arraylist
     */
    void set4B()
    {
        Element titanium = new Element( 22, 26, "http://periodic.lanl.gov/22.shtml" );
        Element zirconium = new Element( 40, 51, "http://periodic.lanl.gov/40.shtml" );
        Element hafnium = new Element( 72, 106, "http://periodic.lanl.gov/72.shtml" );
        Element rutherfordium = new Element( 104, 157, "http://periodic.lanl.gov/104.shtml" );
        b4.add( titanium );
        b4.add( zirconium );
        b4.add( hafnium );
        b4.add( rutherfordium );
    }
    
    /**
     * set5B group to set periodic table's 5B group
     * adds all of the 5B elements into the b5 arraylist
     */
    void set5B()
    {
        Element vanadium = new Element( 23, 28, "http://periodic.lanl.gov/23.shtml" );
        Element nb = new Element( 41, 52, "http://periodic.lanl.gov/41.shtml" );
        Element ta = new Element( 73, 108, "http://periodic.lanl.gov/73.shtml" );
        Element db = new Element( 105, 157, "http://periodic.lanl.gov/105.shtml" );
        b5.add( vanadium );
        b5.add( nb );
        b5.add( ta );
        b5.add( db );
    }
    
    /**
     * set6B group to set periodic table's 6B group
     * adds all of the 6B elements into the b6 arraylist
     */
    void set6B()
    {
        Element cr = new Element( 24, 28, "http://periodic.lanl.gov/24.shtml" );
        Element mo = new Element( 42, 54, "http://periodic.lanl.gov/42.shtml" );
        Element w = new Element( 74, 110, "http://periodic.lanl.gov/74.shtml" );
        Element sg = new Element( 106, 157, "http://periodic.lanl.gov/106.shtml" );
        b6.add( cr );
        b6.add( mo );
        b6.add( w );
        b6.add( sg );
    }
    
    /**
     * set7B group to set periodic table's 7B group
     * adds all of the 7B elements into the b7 arraylist
     */
    void set7B()
    {
        Element mn = new Element( 25, 30, "http://periodic.lanl.gov/25.shtml" );
        Element tc = new Element( 43, 55, "http://periodic.lanl.gov/43.shtml" );
        Element re = new Element( 75, 111, "http://periodic.lanl.gov/75.shtml" );
        Element bh = new Element( 107, 155, "http://periodic.lanl.gov/107.shtml" );
        b7.add( mn );
        b7.add( tc );
        b7.add( re );
        b7.add( bh );
    }
    
    /**
     * set8B group to set periodic table's 8B group - part1
     * adds all of the 8B elements into the b8 arraylist
     */
    void set8B1()
    {
        Element fe = new Element( 26, 30, "http://periodic.lanl.gov/26.shtml" );
        Element ru = new Element( 44, 57, "http://periodic.lanl.gov/44.shtml" );
        Element os = new Element( 76, 114, "http://periodic.lanl.gov/76.shtml" );
        Element hs = new Element( 108, 157, "http://periodic.lanl.gov/108.shtml" );
        b81.add( fe );
        b81.add( ru );
        b81.add( os );
        b81.add( hs );
    }
    
    /**
     * set8B2 group to set periodic table's 8B group -part2
     * adds all of the 8B elements into the b8 arraylist
     */
    void set8B2()
    {
        Element co = new Element( 27, 32, "http://periodic.lanl.gov/27.shtml" );
        Element rh = new Element( 45, 58, "http://periodic.lanl.gov/45.shtml" );
        Element ir = new Element( 77, 115, "http://periodic.lanl.gov/77.shtml" );
        Element mt = new Element( 109, 157, "http://periodic.lanl.gov/109.shtml" );
        b82.add( co );
        b82.add( rh );
        b82.add( ir );
        b82.add( mt );
    }
    
    /**
     * set8B2 group to set periodic table's 8B group -part3
     * adds all of the 8B elements into the b8 arraylist
     */
    void set8B3()
    {
        Element ni = new Element( 28, 31, "http://periodic.lanl.gov/28.shtml" );
        Element pd = new Element( 46, 60, "http://periodic.lanl.gov/46.shtml" );
        Element pt = new Element( 78, 117, "http://periodic.lanl.gov/78.shtml" );
        Element ds = new Element( 110, 159, "http://periodic.lanl.gov/110.shtml" );
        b83.add( ni );
        b83.add( pd );
        b83.add( pt );
        b83.add( ds );
    }
    
    /**
     * set1B group to set periodic table's 1B group 
     * adds all of the 1B elements into the b1 arraylist
     */
    void set1B()
    {
        Element cu = new Element( 29, 35, "http://periodic.lanl.gov/28.shtml" );
        Element ag = new Element( 47, 61, "http://periodic.lanl.gov/46.shtml" );
        Element au = new Element( 79, 118, "http://periodic.lanl.gov/78.shtml" );
        Element rg = new Element( 111, 161, "http://periodic.lanl.gov/110.shtml" );
        b1.add( cu );
        b1.add( ag );
        b1.add( au );
        b1.add( rg );
    }
    
    /**
     * set2B group to set periodic table's 2B group 
     * adds all of the 2B elements into the b2 arraylist
     */
    void set2B()
    {
        Element zn = new Element( 30, 35, "http://periodic.lanl.gov/28.shtml" );
        Element cd = new Element( 48, 64, "http://periodic.lanl.gov/46.shtml" );
        Element hg = new Element( 80, 121, "http://periodic.lanl.gov/78.shtml" );
        Element cn = new Element( 112, 165, "http://periodic.lanl.gov/110.shtml" );
        b2.add( zn );
        b2.add( cd );
        b2.add( hg );
        b2.add( cn );
    }
    
    
    //----------------------------------------- A GROUP GETTERS -------------------------------------------------------------
    /**
     * getGroup1A to set information from 1A group
     * @return info - all of the element's info from specified group
     */
    String getGroup1A()
    {
        String info = "";
        for ( int i = 0 ; i < a1.size() ; i++ )
        {
            info += ( a1.get(i)).toString();
        }
        return info;
    }
    
    
    /**
     * getGroup2A to set information from 2A group
     * @return info - all of the element's info from specified group
     */
    String getGroup2A()
    {
        String info = "";
        for ( int i = 0 ; i < a2.size() ; i++ )
        {
            info += ( a2.get(i)).toString();
        }
        return info;
    }
    
    
    /**
     * getGroup3A to set information from 3A group
     * @return info - all of the element's info from specified group
     */
    String getGroup3A()
    {
        String info = "";
        for ( int i = 0 ; i < a3.size() ; i++ )
        {
            info += ( a3.get(i)).toString();
        }
        return info;
    }
    
    
    /**
     * getGroup4A to set information from 4A group
     * @return info - all of the element's info from specified group
     */
    String getGroup4A()
    {
        String info = "";
        for ( int i = 0 ; i < a4.size() ; i++ )
        {
            info += ( a4.get(i)).toString();
        }
        return info;
    }
    
    
    /**
     * getGroup5A to set information from 5A group
     * @return info - all of the element's info from specified group
     */
    String getGroup5A()
    {
        String info = "";
        for ( int i = 0 ; i < a5.size() ; i++ )
        {
            info += ( a5.get(i)).toString();
        }
        return info;
    }
    
    
    /**
     * getGroup6A to set information from 6A group
     * @return info - all of the element's info from specified group
     */
    String getGroup6A()
    {
        String info = "";
        for ( int i = 0 ; i < a6.size() ; i++ )
        {
            info += ( a6.get(i)).toString();
        }
        return info;
    }
    
    
    /**
     * getGroup7A to set information from 7A group
     * @return info - all of the element's info from specified group
     */
    String getGroup7A()
    {
        String info = "";
        for ( int i = 0 ; i < a7.size() ; i++ )
        {
            info += ( a7.get(i)).toString();
        }
        return info;
    }
    
    
    /**
     * getGroup8A to set information from 8A group
     * @return info - all of the element's info from specified group
     */
    String getGroup8A()
    {
        String info = "";
        for ( int i = 0 ; i < a8.size() ; i++ )
        {
            info += ( a8.get(i)).toString();
        }
        return info;
    }
    
    /**
     * getDesiredA method to get desired element in given location and the cloumn
     * @param groupNo as the desired group no in periodic table
     * @return an element as the desired element in the given group
     */
    Element getDesiredA( int groupNo, int period )
    {
        return  ( getGroupA( groupNo ) ).get( period ) ;
    }
    
    /**
     * getGroupA method to get a group in 
     */
    ArrayList<Element> getGroupA( int number )
    {
        if ( number == 1 ) return a1;
        if ( number == 2 ) return a2;
        if ( number == 3 ) return a3;
        if ( number == 4 ) return a4;
        if ( number == 5 ) return a5;
        if ( number == 6 ) return a6;
        if ( number == 7 ) return a7;
        return a8;
    }
    
    //---------------------------------------------B GROUP GETTERS-----------------------------------------------------------------
    
    /**
     * getGroup3B to set information from 3B group
     * @return info - all of the element's info from specified group
     */
    String getGroup3B()
    {
        String info = "";
        for ( int i = 0 ; i < b3.size() ; i++ )
        {
            info += ( b3.get(i)).toString();
        }
        return info;
    }
    
    
    /**
     * getGroup4B to set information from 4B group
     * @return info - all of the element's info from specified group
     */
    String getGroup4B()
    {
        String info = "";
        for ( int i = 0 ; i < b4.size() ; i++ )
        {
            info += ( b4.get(i)).toString();
        }
        return info;
    }
    
    
    /**
     * getGroup5B to set information from 5B group
     * @return info - all of the element's info from specified group
     */
    String getGroup5B()
    {
        String info = "";
        for ( int i = 0 ; i < b5.size() ; i++ )
        {
            info += ( b5.get(i)).toString();
        }
        return info;
    }
    
    
    /**
     * getGroup6B to set information from 6B group
     * @return info - all of the element's info from specified group
     */
    String getGroup6B()
    {
        String info = "";
        for ( int i = 0 ; i < b6.size() ; i++ )
        {
            info += ( b6.get(i)).toString();
        }
        return info;
    }
    
    
    /**
     * getGroup7B to set information from 7B group
     * @return info - all of the element's info from specified group
     */
    String getGroup7B()
    {
        String info = "";
        for ( int i = 0 ; i < b7.size() ; i++ )
        {
            info += ( b7.get(i)).toString();
        }
        return info;
    }
    
    
    /**
     * getGroup8B1 to set information from 8B1 group
     * @return info - all of the element's info from specified group
     */
    String getGroup8B1()
    {
        String info = "";
        for ( int i = 0 ; i < b81.size() ; i++ )
        {
            info += ( b81.get(i)).toString();
        }
        return info;
    }
    
    /**
     * getGroup8B2 to set information from 8B2 group
     * @return info - all of the element's info from specified group
     */
    String getGroup8B2()
    {
        String info = "";
        for ( int i = 0 ; i < b82.size() ; i++ )
        {
            info += ( b82.get(i)).toString();
        }
        return info;
    }
    
    /**
     * getGroup8B3 to set information from 8B3 group
     * @return info - all of the element's info from specified group
     */
    String getGroup8B3()
    {
        String info = "";
        for ( int i = 0 ; i < b83.size() ; i++ )
        {
            info += ( b83.get(i)).toString();
        }
        return info;
    }
    
    /**
     * getGroup1B to set information from 1B group
     * @return info - all of the element's info from specified group
     */
    String getGroup1B()
    {
        String info = "";
        for ( int i = 0 ; i < b1.size() ; i++ )
        {
            info += ( b1.get(i)).toString();
        }
        return info;
    }
    
    /**
     * getGroup2B to set information from 2B group
     * @return info - all of the element's info from specified group
     */
    String getGroup2B()
    {
        String info = "";
        for ( int i = 0 ; i < b2.size() ; i++ )
        {
            info += ( b2.get(i)).toString();
        }
        return info;
    }
    
    /**
     * getDesiredB method to get desired element in given location and the cloumn
     * @param groupNo as the desired group no in periodic table
     * @return an element as the desired element in the given group
     */
    Element getDesiredB( int groupNo, int period )
    {
        return  ( getGroupB( groupNo ) ).get( period ) ;
    }
    
    /**
     * getGroupB method to get a group which is specified with user's input number
     * @param number - as a desired group number
     */
    ArrayList<Element> getGroupB( int number )
    {
        if ( number == 3 ) return b3;
        if ( number == 4 ) return b4;
        if ( number == 5 ) return b5;
        if ( number == 6 ) return b6;
        if ( number == 7 ) return b7;
        if ( number == 81 ) return b81;
        if ( number == 82 ) return b82;
        if ( number == 83 ) return b83;
        if ( number == 2 ) return b2;
        return b1;
    }
    
}