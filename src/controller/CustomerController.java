package controller;

import data.DataStorage;
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

	
	public String addCustomer(String username, String email, String pwd) {
		
		if (username == null || username.trim().isEmpty()) {
			return "Username cannot be empty.";
		}
		
		if (email == null || email.trim().isEmpty()) {
			return "Email cannot be empty.";
		}
		
		if (!email.trim().matches("^[\\w.+-]+@[\\w-]+\\.[a-zA-Z]{2,}$")) {
			return "Please use a valid email address.";
		}
		
		if (this.ds.getCustomerbyEmail(email.trim()) != null) {
			return "An account with this email address already exists.";
		}
		
		if (pwd == null || pwd.isEmpty()) {
			return "Password cannot be empty.";
		}
		
		if (pwd.length() < 8) {
			return "Password must be at least 8 characters long.";
		}
		
		Customer customer = new Customer(username.trim(), email.trim(), pwd, 0);
		this.ds.addCustomer(customer);
		return null;
	 }

	public boolean verifyCustomer(String email, String password) {
	    Customer t = this.ds.getCustomerbyEmail(email);
	    if (t == null) {
	        return false;
	    }
	    return t.getPassword().equals(password);
	}

	public void editCustomer(int ID, Customer customer) { 
	 } 
	
	public Customer getCustomerbyEmail(String email) {
		return this.ds.getCustomerbyEmail(email);
	}

}
