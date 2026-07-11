package controller;

import data.DataStorage;
import data.Staff;

public class StaffController {

	/**
	 * 
	 */
	
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
	 * @param password 
	 * @param email 
	 * @return 
	 */
	public boolean verifyStaff(String password, String email) { 
		// TODO Auto-generated method
		return false;
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
	 * @param staff 
	 */
	public void addStaff(Staff staff) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @return 
	 */
	public Staff getAllStaff() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param staff 
	 * @param ID 
	 */
	public void editStaff(Staff staff, int ID) { 
		// TODO Auto-generated method
	 } 

}
