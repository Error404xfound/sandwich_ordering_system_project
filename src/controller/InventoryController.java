package controller;

import data.DataStorage;
import data.ItemStock;

public class InventoryController {

	/**
	 * 
	 */
	public DataStorage datastorage;
	/**
	 * 
	 */
	private DataStorage dataStorage;
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
	/**
	 * 
	 * @param itemStock 
	 * @param ID 
	 */
	public void editItemStock(ItemStock itemStock, int ID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @return 
	 */
	public ItemStock getAllItemStock() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param ID 
	 * @param itemStock 
	 */
	public void editItemStock(int ID, ItemStock itemStock) { 
		// TODO Auto-generated method
	 } 

}
