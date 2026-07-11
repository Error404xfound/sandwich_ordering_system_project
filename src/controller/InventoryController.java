package controller;

import data.DataStorage;
import data.ItemStock;

public class InventoryController {

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
	 * @param itemStock 
	 */
	public void addItemStock(ItemStock itemStock) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param ID 
	 */
	public void deleteItemStock(int ID) { 
		// TODO Auto-generated method
	 }
	
	
	public ItemStock getAllItemStock() { 
		// TODO Auto-generated method
		return null;
	 }
	
	public void editItemStock(int ID, ItemStock itemStock) { 
		// TODO Auto-generated method
	 } 

}
