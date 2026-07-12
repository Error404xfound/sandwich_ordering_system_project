package controller;

import data.DataStorage;
import data.Order;

public class OrderController {

	private DataStorage ds = DataStorage.getInstance();
	
	public void addOrder(Order order) { 
	 }

	public Order getAllOrders() { 
		return null;
	 }

	public float calculatePreparationTime(Order order) { 
		return 0;
	 }

	public float calculateTotalPrice(int discountPercentage, Order order) { 
		return 0;
	 }

	public void editOrder(Order order, int ID) { 
	 }

	public void deleteOrder(int ID) { 
	 }

	public void applyDiscount(int customerID, int ID) { 
	 }

	public void editOrder(int ID, Order order) { 
	 } 

}
