import java.util.*;
/**
 * Molecule class to create a molecule
 * @author: Ayca Begum Tascioglu 
 * @version:
 */
public class Molecule
{
    // properties
    ArrayList<Element> molecule;
    
    
    // constructors
    /**
     */
    public Molecule()
    {
        molecule = new ArrayList<>();
    }
    
    
    // methods
    /**
     * isMolecule method to determine if 2 element can occur a molecule
     * @param a - a sample element
     * @param b - a sample element
     */
    public void isMolecule( Element a , Element b )
    {
        if ( ( ( ( a.getAtomNo() > 2 && b.getAtomNo() > 2 ) || ( a.getAtomNo() < 2 && b.getAtomNo() > 2 ) ||
              ( a.getAtomNo() > 2 && b.getAtomNo() < 2 ) ) && a.getValance() + b.getValance() == 8 ) ||
            ( ( a.getAtomNo() < 2 && b.getAtomNo() < 2 ) && a.getValance() + b.getValance() == 2 ) )
        {
            molecule.add(a);
            molecule.add(b);
        }
    }
}
