package controller;

import data.DataStorage;
import data.Staff;
import data.Customer;

public class CustomerController {

	private DataStorage ds = DataStorage.getInstance();

	public void deleteCustomer(int ID) { 
	 }

	public void editCustomer(Customer customer, int ID) { 
	 }

	public Customer getAllCustomers() { 
		return null;
	 }

	public boolean addCustomer(String username, String email, String pwd, int userID) { 
		// Basic email format check (not domain-restricted, unlike staff sign-up)
		if (!email.matches("^[\\w.+-]+@[\\w-]+\\.[a-zA-Z]{2,}$")) {
			return false;
		}
		Customer customer = new Customer(username, email, pwd, userID);
		ds.addCustomer(customer);
		return true;
	 }

	public boolean verifyCustomer(String password, String email) {
	    Customer t = ds.getCustomerbyEmail(email);
	    if (t == null) {
	        return false;
	    }
	    return t.getPassword().equals(password);
	}

	public void editCustomer(int ID, Customer customer) { 
	 } 

}
