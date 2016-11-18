//Antonino Febbraro
//Period 3
//April 29, 2014
//Pitt Banking Program with classes

package pittbankapp;

import javax.swing.JOptionPane;

/**
 *
 * @author AntoninoFebbraro
 */
public class PittBankApp {
    

    /**
     * @param args the command line arguments
     */
    
    /*
           PITTBANKAPP TESTER
    */
    public static void main(String[] args) {  
       //calling statement for main menu of program
        MainMenu();
    }
    
    //main menu method
    public static void MainMenu()
    {
        //creating cusomter objects 
        Customer one=new Customer("Sidney Crosby",123,"Pens Way","Pitsburgh","PA",
                15312);
        Customer two=new Customer("Luke Ravenstahl",876,"Grant Street",
                "Pittsburgh","PA",15112);
        Customer three= new Customer("Hines Ward",1286,"Steeler Avenue",
                "Homestead","PA",15182);
        Customer four= new Customer("Bill Gates",400,"Microsoft Drive",
                "Redmond","WA",98052);
        Customer five=new Customer("Barack Obama",1600,"Pennsylvania Avenue",
                "Washington","DC",20500);
        Customer six=new Customer("Antonino Febbraro",1605,"Middle Road",
                "Glenshaw","PA",15116);
        
         //creating account objects
        Account a= new Account(123456,98765,"Sidney Crosby",123,"Pens Way",
                "Pitsburgh","PA",15312);
        Account b= new Account(12345,12387,"Luke Ravenstahl",876,"Grant Street",
                "Pittsburgh","PA",15112);
        Account c= new Account(1234,45456,"Hines Ward",1286,"Steeler Avenue",
                "Homestead","PA",15182);
        Account d= new Account(234567,24244,"Bill Gates",400,"Microsoft Drive",
                "Redmond","WA",98052);
        Account e= new Account(1240,33243,"Barack Obama",1600,
                "Pennsylvania Avenue","Washington","DC",20500);
        Account f= new Account(23470,10294,"Antonino Febbraro",1605,
                "Middle Road","Glenshaw","PA",15116);
        
        //Deciding what to do for user 
        String input= JOptionPane.showInputDialog("What would you like to do? "
                + "Search Person, Check Balance, Add Interest, Widthdraw,"
                + " Print Information, or exit?");
        
        //if statements for decsion making
        if(input.equalsIgnoreCase("Search Person"))//seach for person
            SearchPerson(a,b,c,d,e,f);
        if(input.equalsIgnoreCase("Check Balance"))//check persons balance
            CheckBalance(a,b,c,d,e,f);
        if(input.equalsIgnoreCase("Add Interest"))//add interest
            AddInterest(a,b,c,d,e,f);
        if(input.equalsIgnoreCase("Widthdraw"))//to widthdraw money
            widthdraw(a,b,c,d,e,f);
        if(input.equalsIgnoreCase("Print Information"))//to print account info
            PrintCertain(a,b,c,d,e,f);
        if(input.equalsIgnoreCase("Exit"))
        {
              
            //Calling statement for printing all people
             PrintAll(one,two,three,four,five,six);
             System.exit(0);
        }
        else
        {     
            //Calling statement for printing all people
            PrintAll(one,two,three,four,five,six);
            System.exit(0);
        }
    }
    
    //Search Person Method
    public static void SearchPerson(Account a,Account b,Account c,Account d, 
            Account e, Account f )
    {
        String input=JOptionPane.showInputDialog("Enter a name to search.");
        
        //searching for name
        boolean flag;
        
        flag=a.checkName(input);
        if(flag)
        {
            JOptionPane.showMessageDialog(null,input+" does exsit.");
            MainMenu();
        }
        flag=b.checkName(input);
        if(flag)
        {
            JOptionPane.showMessageDialog(null,input+" does exsit.");
            MainMenu();
        }
        flag=c.checkName(input);
        if(flag)
        {
            JOptionPane.showMessageDialog(null,input+" does exsit.");
            MainMenu();
        }
        flag=d.checkName(input);
        if(flag)
        {
            JOptionPane.showMessageDialog(null,input+" does exsit.");
            MainMenu();
        }
        flag=e.checkName(input);
        if(flag)
        {
            JOptionPane.showMessageDialog(null,input+" does exsit.");
            MainMenu();
        }
        flag=f.checkName(input);
        if(flag)
        {
            JOptionPane.showMessageDialog(null,input+" does exsit.");
            MainMenu();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"This person does not exsist.");
            MainMenu();
        }
        
        
    }
    
    //Check Balance Method
    public static void CheckBalance(Account a,Account b,Account c,Account d, 
            Account e, Account f )
    {
        String input=JOptionPane.showInputDialog("Enter a name to search.");
        
        //searching for name
        boolean flag;
        
        flag=a.checkName(input);
        if(flag)
        {
            JOptionPane.showMessageDialog(null,input+" has"+a.checkBalance());
            //Back to main menu
            MainMenu();
        }
        flag=b.checkName(input);
        if(flag)
        {
            JOptionPane.showMessageDialog(null,input+" has"+b.checkBalance());
            MainMenu();
        }
        flag=c.checkName(input);
        if(flag)
        {
            JOptionPane.showMessageDialog(null,input+" has"+c.checkBalance());
            MainMenu();
        }
        flag=d.checkName(input);
        if(flag)
        {
            JOptionPane.showMessageDialog(null,input+" has"+d.checkBalance());
            MainMenu();
        }
        flag=e.checkName(input);
        if(flag)
        {
            JOptionPane.showMessageDialog(null,input+" has"+e.checkBalance());
            MainMenu();
        }
        flag=f.checkName(input);
        if(flag)
        {
            JOptionPane.showMessageDialog(null,input+" has"+f.checkBalance());
            MainMenu();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"This person does not exsist.");
            MainMenu();
        }
    }
    
    //Adding interest method
    public static void AddInterest(Account a,Account b,Account c,Account d,
            Account e, Account f)
    {
        String input=JOptionPane.showInputDialog("Enter a name to check for "
                + "interest");
        
        boolean flag, interest;
        
        flag=a.checkName(input);
        if(flag)
        {
            interest=a.Interest();
            if(interest)
            {
                JOptionPane.showMessageDialog(null,"Interest was added!");
                JOptionPane.showMessageDialog(null,"New Balance is: "
                        +a.checkBalance());
                MainMenu();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Sorry, no interest is "
                        + "avaliable to be added at this time.");
                MainMenu();
            }
        }
        flag=b.checkName(input);
        if(flag)
        {
            interest=b.Interest();
            if(interest)
            {
                JOptionPane.showMessageDialog(null,"Interest was added!");
                JOptionPane.showMessageDialog(null,"New Balance is: "
                        +b.checkBalance());
                MainMenu();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Sorry, no interest is "
                        + "avaliable to be added at this time.");
                MainMenu();
            }
        }
        flag=c.checkName(input);
        if(flag)
        {
            interest=c.Interest();
            if(interest)
            {
                JOptionPane.showMessageDialog(null,"Interest was added!");
                JOptionPane.showMessageDialog(null,"New Balance is: "
                        +c.checkBalance());
                MainMenu();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Sorry, no interest is "
                        + "avaliable to be added at this time.");
                MainMenu();
            }
        }
        flag=d.checkName(input);
        if(flag)
        {
            interest=d.Interest();
            if(interest)
            {
                JOptionPane.showMessageDialog(null,"Interest was added!");
                JOptionPane.showMessageDialog(null,"New Balance is: "
                        +d.checkBalance());
                MainMenu();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Sorry, no interest is "
                        + "avaliable to be added at this time.");
                MainMenu();
            }
        }
        flag=e.checkName(input);
        if(flag)
        {
            interest=e.Interest();
            if(interest)
            {
                JOptionPane.showMessageDialog(null,"Interest was added!");
                JOptionPane.showMessageDialog(null,"New Balance is: "
                        +e.checkBalance());
                MainMenu();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Sorry, no interest is"
                        + " avaliable to be added at this time.");
                MainMenu();
            }
        }
        flag=f.checkName(input);
        if(flag)
        {
            interest=f.Interest();
            if(interest)
            {
                JOptionPane.showMessageDialog(null,"Interest was added!");
                JOptionPane.showMessageDialog(null,"New Balance is: "
                        +f.checkBalance());
                MainMenu();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Sorry, no interest is"
                        + " avaliable to be added at this time.");
                MainMenu();
            }
        }
    }
    
    //Method for widthdrawing money
    public static void widthdraw(Account a,Account b,Account c,Account d,
            Account e, Account f)
    {
        String input=JOptionPane.showInputDialog("Enter a name to search.");
        String temp=JOptionPane.showInputDialog("Enter amout to widthdraw.");
        int money=Integer.parseInt(temp);
        
        //searching for name
        boolean flag;
        
        flag=a.checkName(input);
        if(flag)
        {
            JOptionPane.showMessageDialog(null,a.widthdraw(money));
            MainMenu();
        }
        flag=b.checkName(input);
        if(flag)
        {
            JOptionPane.showMessageDialog(null,b.widthdraw(money));
            MainMenu();
        }
        flag=c.checkName(input);
        if(flag)
        {
           JOptionPane.showMessageDialog(null,c.widthdraw(money));
           MainMenu();
        }
        flag=d.checkName(input);
        if(flag)
        {
            JOptionPane.showMessageDialog(null,d.widthdraw(money));
            MainMenu();
        }
        flag=e.checkName(input);
        if(flag)
        {
            JOptionPane.showMessageDialog(null,e.widthdraw(money));
            MainMenu();
        }
        flag=f.checkName(input);
        if(flag)
        {
           JOptionPane.showMessageDialog(null,f.widthdraw(money));
           MainMenu();
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"This person does not exsist.");
            MainMenu();
        }
    }
    
    //Method for printing certain account numbers 
    public static void PrintCertain(Account a,Account b,Account c,Account d,
            Account e, Account f)
    {
         String input=JOptionPane.showInputDialog("Enter a name to search.");
        
        //searching for name
        boolean flag;
        
        flag=a.checkName(input);
        if(flag)
        {
            JOptionPane.showMessageDialog(null,a);
            MainMenu();
        }
        flag=b.checkName(input);
        if(flag)
        {
            JOptionPane.showMessageDialog(null,b);
            MainMenu();
        }
        flag=c.checkName(input);
        if(flag)
        {
            JOptionPane.showMessageDialog(null,c);
            MainMenu();
        }
        flag=d.checkName(input);
        if(flag)
        {
            JOptionPane.showMessageDialog(null,d);
            MainMenu();
        }
        flag=e.checkName(input);
        if(flag)
        {
            JOptionPane.showMessageDialog(null,e);
            MainMenu();
        }
        flag=f.checkName(input);
        if(flag)
        {
            JOptionPane.showMessageDialog(null,f);
            MainMenu();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"This person does not exsist.");
            MainMenu();
        }
    }
    
    //Method for printing everything-- AKA output
    public static void PrintAll(Customer a,Customer b,Customer c,Customer d,
            Customer e,Customer f)
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
