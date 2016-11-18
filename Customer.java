//Antonino Febbraro
//Period 3
//April 29, 2014
//Pitt Banking Program with classes

package pittbankapp;

/**
 *
 * @author AntoninoFebbraro
 */
public class Customer extends Address{
    String name;
    Customer(String name,int address,String street,String city,String state,
            int zipcode)
    {
        super(address,street,city,state,zipcode);
        this.name=name;
    }
    
    //Method for seeing if customer exsists 
    public boolean checkName(String names)
    {
        if(names.equalsIgnoreCase(name))
            return true;
        else
            return false;
    }
    
    //toString method
    public String toString()
    {
        return(name+":\t"+super.toString());
    }
}
