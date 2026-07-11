package controller;

import data.DataStorage;
import data.Sandwich;

public class SandwichController {

	/**
	 * 
	 */
	private DataStorage dataStorage;
	/**
	 * 
	 */
	public DataStorage datastorage;
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
	 * Getter of datastorage
	 */
	public DataStorage getDatastorage() {
	 	 return datastorage; 
	}
	/**
	 * Setter of datastorage
	 */
	public void setDatastorage(DataStorage datastorage) { 
		 this.datastorage = datastorage; 
	}
	/**
	 * 
	 * @param ID 
	 * @return 
	 */
	public boolean markSandwichComplete(int ID) { 
		// TODO Auto-generated method
		return false;
	 }
	/**
	 * 
	 */
	public void getAllSandwiches() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param sandwich 
	 * @param ID 
	 */
	public void editSandwich(Sandwich sandwich, int ID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param ID 
	 */
	public void deleteSandwich(int ID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param sandwich 
	 */
	public void addSandwich(Sandwich sandwich) { 
		// TODO Auto-generated method
	 } 

}
