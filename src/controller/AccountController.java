package controller;

import data.DataStorage;
import data.Staff;
import data.Customer;
import java.util.List;

public class AccountController {

	/**
	 * 
	 */
	private DataStorage dataStorage;

	/**
	 * Getter of dataStorage
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
	 */
	public void getAllStaff() { 
		// TODO Auto-generated method
	 }

	/**
	 * 
	 * @param ID 
	 */
	public void deleteStaff(int ID) { 
		// TODO Auto-generated method
	 }

	/**
	 * 
	 * @param email 
	 * @param password 
	 */
	public void verifyCustomer(String email, String password) { 
		// TODO Auto-generated method
	 }

	/**
	 * 
	 * @param ID 
	 * @param staff 
	 */
	public void editStaff(int ID, Staff staff) { 
		// TODO Auto-generated method
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
	 */
	public void addCustomer(Customer customer) { 
		// TODO Auto-generated method
	 }

	/**
	 * 
	 * @param staff 
	 */
	public void addStaff(Staff staff) { 
		// TODO Auto-generated method
	 }

	/**
	 * 
	 * @return 
	 */
	public List<Customer> getAllCustomers() { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * 
	 * @param email 
	 * @param password 
	 */
	public void verifyStaff(String email, String password) { 
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

}
