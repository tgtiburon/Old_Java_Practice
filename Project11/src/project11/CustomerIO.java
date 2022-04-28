package project11;



public class CustomerIO
{
    //boolean needed to flag a bad customer number
    public static boolean customerFound = false;
    public static Customer getCustomer(int custNo) throws NoSuchCustomerException
    {
        Customer cust = new Customer();
       
        
    
            if (custNo == 1000)
            {
                cust.name = "Andrew Antosca";
                cust.address = "485 Duane Terrace";
                cust.city = "Ann Arbor";
                cust.state = "MI";
                cust.zipCode = "48108";
                customerFound = true;
            }
            else if (custNo == 1001)
            {
                cust.name = "Barbara White";
                cust.address = "3400 Richmond Parkway #3423";
                cust.city = "Bristol";
                cust.state = "CT";
                cust.zipCode = "06010";
                customerFound = true;
            
            }
            else if (custNo == 1002)
            {
                cust.name = "Karl Vang";
                cust.address = "327 Franklin Street";
                cust.city = "Edina";
                cust.state = "MN";
                cust.zipCode = "55435";
                customerFound = true;
             
            }
            else if (custNo == 1003)
            {
                cust.name = "Ronda Chavan";
                cust.address = "518 Comanche Dr.";
                cust.city = "Greensboro";
                cust.state = "NC";
                cust.zipCode = "27410";
                customerFound = true;
              
            }
            else if (custNo == 1004)
            {
                cust.name = "Sam Carol";
                cust.address = "9379 N. Street";
                cust.city = "Long Beach";
                cust.state = "CA";
                cust.zipCode = "90806";
                customerFound = true;
             
            }

            //If it was a valid customer..return the customer object
            if(customerFound  == true)
            {
                   return cust;
            }//end if
        // was not a valid customer so throw a new exception and pass the
        // invalid number
            else
            {

              throw new NoSuchCustomerException(custNo);

            }//end else


    }//end getCustomer
}//end class