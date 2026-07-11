package controller;

import data.DataStorage;
import data.Order;

public class OrderController {

	/**
	 * 
	 */
	private DataStorage dataStorage;
	/**
	 * 
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
	
	public void addOrder(Order order) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @return 
	 */
	public Order getAllOrders() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param order 
	 * @return 
	 */
	public float calculatePreparationTime(Order order) { 
		// TODO Auto-generated method
		return 0;
	 }
	/**
	 * 
	 * @param discountPercentage 
	 * @param order 
	 * @return 
	 */
	public float calculateTotalPrice(int discountPercentage, Order order) { 
		// TODO Auto-generated method
		return 0;
	 }
	/**
	 * 
	 * @param order 
	 * @param ID 
	 */
	public void editOrder(Order order, int ID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param ID 
	 */
	public void deleteOrder(int ID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param customerID 
	 * @param ID 
	 */
	public void applyDiscount(int customerID, int ID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param ID 
	 * @param order 
	 */
	public void editOrder(int ID, Order order) { 
		// TODO Auto-generated method
	 } 

}
