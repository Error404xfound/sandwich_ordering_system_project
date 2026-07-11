package gui;

import data.Order;
import data.Sandwich;

public class EditOrderScreen {

	/**
	 * 
	 */
	private int orderIndex;
	private Order order;
	/**
	 * Getter of orderIndex
	 */
	public int getOrderIndex() {
	 	 return orderIndex; 
	}
	/**
	 * Setter of orderIndex
	 */
	public void setOrderIndex(int orderIndex) { 
		 this.orderIndex = orderIndex; 
	}
	/**
	 * Getter of order
	 */
	public Order getOrder() {
	 	 return order; 
	}
	/**
	 * Setter of order
	 */
	public void setOrder(Order order) { 
		 this.order = order; 
	}
	/**
	 * 
	 * @param idx 
	 * @param sandwich 
	 */
	public void showEditSandwich(int idx, Sandwich sandwich) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param sandwich 
	 * @param idx 
	 */
	public void showEditSandwich(Sandwich sandwich, int idx) { 
		// TODO Auto-generated method
	 } 

}
