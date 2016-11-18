//Antonino Febbraro
//Period 3
//April 29, 2014
//Pitt Banking Program with classes

package pittbankapp;

import java.text.DecimalFormat;

/**
 *
 * @author AntoninoFebbraro
 */
public class Account extends Customer {
   double sal;
   int accountnum;
   DecimalFormat formatter=new DecimalFormat("$0.00");//for formatting salary
   
  Account(double sal,int accountnum,String name,int address,String street,
          String city,String state,int zipcode)
  {
      super(name,address,street,city,state,zipcode);
      this.sal=sal;
      this.accountnum=accountnum;
  }
  
  //Method for checking balance
  public String checkBalance()
  {
      return(" "+formatter.format(sal));
  }
  
  //Method for adding interest in able to
  public boolean Interest()
  {
      if(sal>2000)
      { 
          this.sal=this.sal+(this.sal*0.03);//adding 3% interest
          return true;
      }
      else
          return false;
  }
  
  //Method for widthdrawing money
  public String widthdraw(int money)
  {
      if(sal>=money)
      {
          this.sal= this.sal-money;
          return("You widthdrew $"+money+" you now have $"+sal
                  +" in your account.");
      }
      else
          return("Not enough money in your account to widthdraw that amount.");
  }
  
  //Method for printing account number and account balance
  public String toString()
  {
      return("Account Number: "+accountnum+"\t"+" Account Balance is: "
              +formatter.format(sal));
  }
}
