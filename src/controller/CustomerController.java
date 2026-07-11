package controller;

import data.DataStorage;
import data.Customer;

public class CustomerController {

	
	private DataStorage dataStorage;
	/**
	 * Getter of datastorage
	 */
	
	public DataStorage getDataStorage() {
	 	 return dataStorage; 
	}
	/**
	 * Setter of dataStorage
	 */
	public void setDataStorage(DataStorage dataStorage) { 
		 this.dataStorage = dataStorage; 
	}
	/**
	 * 
	 * @param ID 
	 */
	public void deleteCustomer(int ID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param customer 
	 * @param ID 
	 */
	public void editCustomer(Customer customer, int ID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @return 
	 */
	public Customer getAllCustomers() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param customer 
	 */
	public void addCustomer(Customer customer) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param email 
	 * @param password 
	 * @return 
	 */
	public boolean verifyCustomer(String email, String password) { 
		// TODO Auto-generated method
		return false;
	 }
	/**
	 * 
	 * @param ID 
	 * @param customer 
	 */
	public void editCustomer(int ID, Customer customer) { 
		// TODO Auto-generated method
	 } 

}
