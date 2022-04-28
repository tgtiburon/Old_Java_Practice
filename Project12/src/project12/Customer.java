// Assign 12 CITP 190

/**
 * Project: Project 12
 * Author: Tony Gendreau
 * Date: May 1, 2011
 *
 * Purpose: Customer class
 */
package project12;

public class Customer
{
	private String email;
	private String firstName;
	private String lastName;
/** ----------------------------------------------------------------
// Customer() -- Constructor for Customer
// parameters  --   none
//
// return value -- none
//-----------------------------------------------------------------*/
	public Customer()
	{
		email = "";
		firstName = "";
		lastName = "";
	}

/** ----------------------------------------------------------------
// Customer -- Constructor for Customer
// parameters  --   String email, String firstName, String lastName
//
// return value -- none
//-----------------------------------------------------------------*/

	public Customer(String email, String firstName, String lastName)
	{
            //set passed variables to the customer object
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}

/** ----------------------------------------------------------------
// setEmail -- sets the email of the customer
// parameters  --   String email
//
// return value -- none
//-----------------------------------------------------------------*/
	public void setEmail(String email)
	{
		this.email = email;
	}
/** ----------------------------------------------------------------
// getEmail -- gets the email of the customer
// parameters  --   none
//
// return value -- email
//-----------------------------------------------------------------*/

	public String getEmail(){
		return email;
	}
/** ----------------------------------------------------------------
// setFirstName -- sets the first name of the customer
// parameters  --   String firstName
//
// return value -- none
//-----------------------------------------------------------------*/

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
/** ----------------------------------------------------------------
// getFirstName -- gets the First name of the customer
// parameters  --   none
//
// return value -- firstName
//-----------------------------------------------------------------*/
	public String getFirstName()
	{
		return firstName;
	}
/** ----------------------------------------------------------------
// setLastName -- sets the last name of the customer
// parameters  --   String lastName
//
// return value -- none
//-----------------------------------------------------------------*/
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
/** ----------------------------------------------------------------
// getLastName -- gets the Last name of the customer
// parameters  --   none
//
// return value -- lastName
//-----------------------------------------------------------------*/
	public String getLastName()
	{
		return lastName;
	}
/** ----------------------------------------------------------------
// equals  -- sees if one customer is equal to the other
// parameters  --   Object object
//
// return value -- none
//-----------------------------------------------------------------*/

	public boolean equals(Object object)
	{
		if (object instanceof Customer)
		{
			Customer customer2 = (Customer) object;
			if(this.email.equals(customer2.getEmail()))
			{
				return true;
			}
		}
		return false;
	}

}