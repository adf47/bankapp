//Antonino Febbraro
//Period 3
//April 29, 2014
//Pitt Banking Program with classes

package pittbankapp;

/**
 *
 * @author AntoninoFebbraro
 */
public class Address {
    int address,zipcode;
    String street,city,state;
    
    //constructor
    Address(int address,String street,String city,String state,int zipcode)
    {
        this.address=address;
        this.street=street;
        this.city=city;
        this.state=state;
        this.zipcode=zipcode;
    }
    
    //toString method for output
   public String toString()
    {
        return(address+" "+street+" "+city+", "+state+" "+zipcode);
    }
}
