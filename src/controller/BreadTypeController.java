package controller;

import data.DataStorage;
import data.BreadType;

public class BreadTypeController {

	/**
	 * 
	 */
	
	private DataStorage dataStorage;
	/**
	 * Getter of datastorage
	 */
	
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
	 * @return 
	 */
	public BreadType getAllBreadTypes() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param ID 
	 */
	public void deleteBreadType(int ID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param breadType 
	 */
	public void addBreadType(BreadType breadType) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param dietaryTags 
	 * @return 
	 */
	public BreadType filterBreadType(String dietaryTags) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param ID 
	 * @param breadType 
	 */
	public void editBreadType(int ID, BreadType breadType) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param breadType 
	 * @param ID 
	 */
	public void editBreadType(BreadType breadType, int ID) { 
		// TODO Auto-generated method
	 } 

}
